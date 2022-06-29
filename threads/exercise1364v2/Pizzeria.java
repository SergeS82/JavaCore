package threads.exercise1364v2;

import java.util.Map;
import java.util.Objects;
import java.util.concurrent.*;

import static java.lang.Thread.currentThread;
import static java.lang.Thread.sleep;

public class Pizzeria {
    private BlockingQueue<String> queue = new LinkedBlockingQueue();
    private final ExecutorService executorService = Executors.newFixedThreadPool(2);
    private ConcurrentMap<Track,Long> tracks = new ConcurrentHashMap<>();
    static private final long CLIENT_MAX_WAIT = 750L;
    static private final long WORK_DAY = 5000l;
    static private final long DAY_START = System.currentTimeMillis();

    public Pizzeria() {
        tracks.put(new Track("Tr1"),0l);
        tracks.put(new Track("Tr2"),0l);
        for (Map.Entry<Track,Long> track : tracks.entrySet()) {
            executorService.submit(track.getKey());
        }
        new Thread(() -> {
            try {
                sleep(Pizzeria.WORK_DAY);
                executorService.shutdownNow();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }).start();
    }
    //
    long getTimeToEnd(){
        long result = 0, currTime = System.currentTimeMillis();
        int cnt = 0;
        for (Map.Entry<Track,Long> track : tracks.entrySet()) {
            if (track.getValue() != 0) {
                result = (result != 0) ? Math.min(result, Track.DELIVERY_TIME-(currTime-track.getValue())) : Track.DELIVERY_TIME-(currTime-track.getValue());
                cnt++;
            }
        }
        return cnt<tracks.size() ? 0 : result;
    }

    class PizzeriaOutOfTimeException extends Exception{
        final int type;

        PizzeriaOutOfTimeException(int type, String message) {
            super(message);
            if (type != 1 && type != 2) {
                throw new IllegalArgumentException("type can't be " + type);
            }
            this.type = type;
        }
    }


    public void order(String pizzaName) {
        try {
            if (this.checkEndWorkDay())
                throw new PizzeriaOutOfTimeException(1, pizzaName + " is NOT delivered");
            else if (this.getTimeToEnd() + Track.DELIVERY_TIME > CLIENT_MAX_WAIT) {
                throw new PizzeriaOutOfTimeException(2, pizzaName + " is NOT delivered");
            } else queue.offer(pizzaName);
        }catch (PizzeriaOutOfTimeException e){
            System.out.println(e.getMessage());
            if (e.type==1) {
                executorService.shutdownNow();
            }
        }
    }

    synchronized boolean checkEndWorkDay() {
        return WORK_DAY - (System.currentTimeMillis()-DAY_START)-Track.DELIVERY_TIME < 0;
    }

    class Track implements Runnable {
        private final String name;
        static final long DELIVERY_TIME = 500;

        public Track(String name) {
            if (name == null) throw new IllegalArgumentException("Track(name)");
            this.name = name;
        }

        @Override
        public void run() {
            String pizzaName;
            try {
                while (!currentThread().isInterrupted()) {
                    pizzaName = queue.poll(1, TimeUnit.DAYS);
                    if (pizzaName == null) continue;
                    tracks.put(this,System.currentTimeMillis());
                    sleep(DELIVERY_TIME);
                    tracks.put(this,0L);
                    System.out.println(pizzaName+" is delivered");
                }
            } catch (InterruptedException e) {
            }
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Track track = (Track) o;
            return name.equals(track.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name);
        }
    }
}
