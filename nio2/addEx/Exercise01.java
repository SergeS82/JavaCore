package nio2.addEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Exercise01 {
    public static void main(String[] args) {
        Path path = Paths.get("src/nio2/addEx/balance.txt");
        Map<FileLine, String> outSet = new TreeMap<>(FileLine.comparator);
        try (BufferedReader bufferedReader = Files.newBufferedReader(path)){
            String line = null;
            int i=0;
            while ((line = bufferedReader.readLine())!=null){
                i++;
                outSet.put(new FileLine(i + "," + line, s->s[0], s->s[1], s->s[2]), line);
            }
        }catch (IOException e){
        }
        System.out.println(outSet);
        int sum = outSet.keySet().stream().mapToInt((o)->o.getAmount()).sum();
        Path outFile = Paths.get(path.getParent() + "/" + String.format(path.getFileName().toString().replace(".", "_total_%s."), LocalDate.now().format(DateTimeFormatter.ofPattern("ddMMyy"))));
        try {
            List<String> outLines = new ArrayList<>(outSet.entrySet().stream().map(o -> o.getValue()).toList());
            outLines.add("Итого, " + sum);
            Files.write(outFile, outLines);
        } catch (IOException e) {
            System.out.println("Не удалось записать в файл "+ outFile.getFileName());
            e.printStackTrace();
        }
    }
}
