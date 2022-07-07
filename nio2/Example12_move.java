package nio2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Example12_move {
    public static void main(String[] args) {
        try {
            Files.move(Paths.get("c:\\zoo"), Paths.get("c:\\zoo-new"));
            Files.move(Paths.get("c:\\zoo\\addresses.txt"), Paths.get("c:\\zoo-new\\addresses.txt"));
        } catch (IOException e) {
            // Handle file I/O exception
        }
    }
}
