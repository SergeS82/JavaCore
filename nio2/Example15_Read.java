package nio2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
//������ �����������: ���� �� ���������� ����� ������� ����, �� �� �������� ��������� ��� ���������� ������ ��� ����� JVM � ����� ��������� OutOfMemoryError
public class Example15_Read {
    public static void main(String[] args) {
        Path path = Paths.get("fish/sharks.log");
        try {
            List<String> lines = Files.readAllLines(path); // ��������� ������ �� ����� � ����
            for (String line : lines) {
                System.out.println(line); // ������� ���������� �� �������
            }
        } catch (IOException exception) {
            // Handle file I/O exception
        }
    }
}
