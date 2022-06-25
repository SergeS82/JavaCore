package threads.interruptException;

public class InterruptExample4 {
    public static void main(String[] args) {
        while(!Thread.currentThread().isInterrupted()){
            System.out.println("qwerty");
        }
        try{
            Thread.currentThread().sleep(1);
        }catch(InterruptedException e)  {
            System.out.println("interrupted"); // ���� �� �������� �.�. IDEA ������ ������� thread.stop()
        }
    }
}
