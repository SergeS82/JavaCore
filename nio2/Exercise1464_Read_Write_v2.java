package nio2;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Exercise1464_Read_Write_v2 {
    public static void main(String[] args) {
        try {
            Path path = Paths.get("src/nio2/Exercise1464.txt").toRealPath();
            List<String> lines = Files.readAllLines(path);
            try (BufferedWriter bw = Files.newBufferedWriter(Paths.get("src/nio2/Exercise1464_res.txt"))){
                for (int i = lines.size()-1; i>=0; i--){
                    bw.write(lines.get(i));
                    bw.write("\n");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
