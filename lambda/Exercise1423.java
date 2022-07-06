package lambda;

public class Exercise1423 {

    public static double doubleFromString(int value, Worker worker) {
        return worker.rework(value);
    }

    public static void main(String[] args) {
        System.out.println(doubleFromString(5, val -> Double.valueOf(val + 10)));
    }
}
