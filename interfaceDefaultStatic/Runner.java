package interfaceDefaultStatic;

public interface Runner {
    default int getResult() {
        return 10;
    }
}
