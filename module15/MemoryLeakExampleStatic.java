package module15;

import java.io.IOException;
import java.util.*;

public class MemoryLeakExampleStatic {

    static class MemoryLeak {
        //ToDo тут из-за static происходит утечка
        List<byte[]> DATA = new LinkedList<>();

        MemoryLeak() {
            for (int i = 0; i < 2000; i++) {
                DATA.add(new byte[1024 * 1024]);
            }
        }

        void printDataSize() {
            System.out.println(DATA.size());
        }
    }

    public static void main(String[] args) throws IOException {
        System.in.read();
        createMemoryLeak();
        System.in.read();
        createMemoryLeak();
        System.in.read();
        createMemoryLeak();
        System.in.read();
    }

    static void createMemoryLeak() {
        MemoryLeak memoryLeak = new MemoryLeak();
        memoryLeak.printDataSize();
    }
}
