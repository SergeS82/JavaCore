package nio2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

// копирование тольок одного файла
// для копирования директории нужно пробежать по всем файлам
public class Example11_copy {
    public static void main(String[] args) {
        try {
            Files.copy(Paths.get("/panda"), Paths.get("/panda-save"));
            Files.copy(Paths.get("panda/bamboo.txt"), Paths.get("panda-save/bamboo.txt"));
        } catch (IOException e) {
            // Handle file I/O exception
        }
    }
}
