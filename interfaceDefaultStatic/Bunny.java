package interfaceDefaultStatic;

public class Bunny implements Hop{
    private static void printDetails() {
        System.out.println(Hop.getJumpHeight()); // �������� 8
    }

    public static void main(String[] args) {
        printDetails();
    }
}
