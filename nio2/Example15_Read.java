package nio2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
//Будьте внимательны: если вы прочитаете очень большой файл, то вы рискуете заполнить всю выделенную память для вашей JVM и будет выброшено OutOfMemoryError
public class Example15_Read {
    public static void main(String[] args) {
        Path path = Paths.get("fish/sharks.log");
        try {
            List<String> lines = Files.readAllLines(path); // сохраняем строки из файла в лист
            for (String line : lines) {
                System.out.println(line); // выводим содержимое на консоль
            }
        } catch (IOException exception) {
            // Handle file I/O exception
        }
    }
}
