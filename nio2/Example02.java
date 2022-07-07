package nio2;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

//конвертация старый API - новый API
public class Example02 {
    public static void main(String[] args) {
        File file = new File("pandas/cuddly.png");
        Path path = file.toPath(); // конвертация в Path

        Path path2 = Paths.get("cuddly.png");
        File file2 = path2.toFile(); // конвертация в File
    }
}
