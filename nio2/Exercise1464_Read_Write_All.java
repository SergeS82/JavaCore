package nio2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Exercise1464_Read_Write_All {
    public static void main(String[] args) {
        try {
            Path path = Paths.get("src/nio2/Exercise1464.txt").toRealPath();
            List<String> strings = Files.readAllLines(path);
            Set<String> strings1 = new TreeSet<>((s1, s2) -> s2.length()-s1.length());
            strings1.addAll(strings);
            Path path1 = Paths.get("src/nio2/Exercise1464_res.txt");
            Files.write(path1,strings1);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
