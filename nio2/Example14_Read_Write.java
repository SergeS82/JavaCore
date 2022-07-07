package nio2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
// Видео про кодировку https://www.youtube.com/watch?v=HhUuzFXdyNs&list=PLTd6ceoshprfijQztP-IKey4OV7nkr_va&index=6
public class Example14_Read_Write {
    public static void v1(){
        Path path = Paths.get("/animals/gopher.txt");
        try (BufferedReader reader = Files.newBufferedReader(path, StandardCharsets.US_ASCII)) { // Выбираем кодировку файла
            // читаем со стрима
            String currentLine = null;
            while ((currentLine = reader.readLine()) != null) {
                System.out.println(currentLine);
            }
        } catch (IOException e) {
            // Handle file I/O exception
        }
    }

    public static void v2(){
        Path path2 = Paths.get("/animals/gorilla");
        List<String> data = new ArrayList<>();
        try (BufferedWriter writer = Files.newBufferedWriter(path2, Charset.defaultCharset())) {
            writer.write("Hello World");
        } catch (IOException e) {
            // Handle file I/O exception
        }
    }
}
