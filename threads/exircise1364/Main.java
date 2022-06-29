package threads.exircise1364;

public class Main {
    public static void main(String[] args) throws InterruptedException{

        Pizzeria pizzeria = new Pizzeria();
        pizzeria.order("Margarita"); //500-100-100 = 300
        Thread.sleep(100);
        pizzeria.order("Pepperoni"); //500-100 = 400
        Thread.sleep(100);
        pizzeria.order("Sicilian"); //500
        Thread.sleep(100);
        pizzeria.order("Greek");
        Thread.sleep(100);

    }
}
