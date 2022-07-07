package nio2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Example13_delete {
    public static void main(String[] args) {
        try {
            Files.delete(Paths.get("vulture/feathers.txt"));
            Files.deleteIfExists(Paths.get("pigeon"));
        } catch (IOException e) {
            // Handle file I/O exception
        }
    }

}
