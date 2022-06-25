package threads.interruptException.exConsoleClock1244;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ConsoleClock extends Thread{
    Calendar calendar = Calendar.getInstance();
    SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
    @Override
    public void run(){
        try {
            while (true) {
                calendar.setTimeInMillis(Calendar.getInstance().getTimeInMillis());
                System.out.println(dateFormat.format(calendar.getTime()));
                //Thread.currentThread().sleep(1000);
                Thread.sleep(1000);
                this.test();
            }
        }catch (InterruptedException e) {
            System.out.println("The clock was stopped");
        }
    }
    public static void test(){
        System.out.println("1");
    }
}
