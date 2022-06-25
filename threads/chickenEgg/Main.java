package threads.chickenEgg;

import java.util.Random;

class ChickenEgg extends Thread {

    public ChickenEgg(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                // ���������������� �����
                sleep(getTimeSleep());
                System.out.println(getName());
            } catch (InterruptedException e) {
            }
        }
    }

    final Random random = new Random();

    int getTimeSleep() {

        return random.nextInt(300);
    }
}

public class Main {

    public static void main(String[] args) {
        // �������� ������� � �������
        ChickenEgg chicken = new ChickenEgg("������");
        ChickenEgg egg = new ChickenEgg("����");
        System.out.println("�������� ����: ��� �������� ������?");
        // ������ �������
        chicken.start();
        egg.start();
        // ���� ��� ������ ��������
/*        while (chicken.isAlive() || egg.isAlive()) {
            try {
                // ���������������� ����� "�����"
                Thread.sleep(1);
                //System.out.println("������");
            } catch (InterruptedException e) {
            }
        }*/
        // C������ �� ���� ��������� �����?
        do {
            if (!chicken.isAlive()) {
                try {
                    // ��������� ����
                    egg.interrupt();
                    // ����, ���� ���� �������� �������������
                    egg.join();
                } catch (InterruptedException e) {
                }
                System.out.println("������ ��������� ����!");
                break;
            } else if (!egg.isAlive()) {
                try {
                    // ��������� ������
                    chicken.interrupt();
                    // ����, ���� ������ �������� �������������
                    chicken.join();
                } catch (InterruptedException e) {
                }
                System.out.println("������ ��������� ������!");
                break;
            } else continue;
        }while(1==1);
        System.out.println("���� ��������");
    }
}
