package interfaceDefaultStatic;

public interface Swimmer {
    default int getResult() { // ������ 2
        return 15;
    }
    default void swim() {
        System.out.println("Swimming");
    }
}
