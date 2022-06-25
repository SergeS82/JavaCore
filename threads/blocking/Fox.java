package threads.blocking;

class Food {}

class Water {}

public class Fox {

    private void eatAndDrink(Food food, Water water) {
        synchronized(food) { // ���� ������������� ������� Food
            System.out.println("Got food!");
            move();
            synchronized(water) { // ���� ������������� ������� Water
                System.out.println("Got water!");
            }
        }
    }

    private void drinkAndEat(Food food, Water water) {
        synchronized(water) { // ���� ������������� ������� Water
            System.out.println("Got water!");
            move();
            synchronized(food) { // ���� ������������� ������� Food
                System.out.println("Got food!");
            }
        }
    }

    private void move() {
        try {
            Thread.sleep(100);
        } catch(InterruptedException exception) {
            // ����������, ���� ������� ������
        }
    }

    public static void main(String[] args) {
        Fox fox1 = new Fox();
        Fox fox2 = new Fox();
        Food food = new Food();
        Water water = new Water();
        Thread t1 = new Thread() {
            public void run() {
                fox1.eatAndDrink(food, water);
            }
        };
        Thread t2 = new Thread() {
            public void run() {
                fox2.drinkAndEat(food, water);
            };
        };
        t1.start();
        t2.start();
    }
}
