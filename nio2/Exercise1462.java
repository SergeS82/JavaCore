package nio2;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Exercise1462 {
    public static void main(String[] args) {
        Path path = Paths.get("/home/skillfactory/task.task");
        System.out.println(path.isAbsolute());
    }
}
