package interfaceDefaultStatic;

public interface Swimmer {
    default int getResult() { // строка 2
        return 15;
    }
    default void swim() {
        System.out.println("Swimming");
    }
}
