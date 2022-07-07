package nio2;

import java.io.IOException;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;

public class Example07_toRealPath {
    public static void main(String[] args) {

        try {
            System.out.println(Paths.get("C:\\Users\\79778\\IdeaProjects\\JavaCore\\src\\nio2").toRealPath());
            System.out.println(Paths.get("C:\\Users\\79778\\IdeaProjects\\JavaCore\\src\\nio2\\..\\Test.java").toRealPath());
        } catch (NoSuchFileException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
