package nio2;

import java.nio.file.Files;
import java.nio.file.Paths;

public class Example08_exists {
    public static void main(String[] args) {
        boolean exists1 = Files.exists(Paths.get("/ostrich/feathers.png"));
        boolean exists2 = Files.exists(Paths.get("/ostrich"));
    }
}
