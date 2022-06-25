package threads.blocking.typer;

import java.nio.charset.Charset;
import java.util.LinkedList;
import java.util.Queue;

public class Typer extends Thread {
    String message;

    public Typer(String message) {
        this.message = message;
    }

    @Override
    public void run() {
        typeMessage(message);
    }

    private static synchronized void typeMessage(String message) {
        for (char ch : message.toCharArray()) {
            try {
                System.out.print(ch);
                sleep(500);
            } catch (InterruptedException e) {
                break;
            }
        }
    }
}

