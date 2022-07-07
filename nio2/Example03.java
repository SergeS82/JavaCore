package nio2;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Example03 {
    public static void main(String[] args) {
        Path path = Paths.get("/land/hippo/harry.happy");
        System.out.println("The path name is: " + path); // The path name is: land/hippo/harry.happy

        for (int i = 0; i < path.getNameCount(); i++) {
            System.out.println("Element " + i + " is : " + path.getName(i));
        }
        path.getFileName();
        path.getName(path.getNameCount()-1);

    }
}
