package nio2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

// проверка идентичности путей
public class Example09_isSameFile {
    public static void main(String[] args) {
        try {
            Files.isSameFile(Paths.get("/user/home/cobra"), Paths.get("/user/home/snake")); // true
            Files.isSameFile(Paths.get("/user/tree/../monkey"), Paths.get("user/monkey")); // true
        } catch (IOException e) {
            // Handle file I/O exception
        }
    }
}
