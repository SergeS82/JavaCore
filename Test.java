import java.time.LocalDate;
import java.util.ArrayList;

public class Test implements Runnable {

    public void run() {
        System.out.print("A");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.print("B");
    }

    public static void main(String[] args) throws InterruptedException {
        new Thread(new Test()).run();
        new Thread(new Test()).run();
        ArrayList<String> strings = new ArrayList<>();
        LocalDate now = LocalDate.now();
    }

}