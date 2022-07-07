package nio2;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Example05_absolute {
    public static void main(String[] args) {
        Path path1 = Paths.get("c:\\birds\\egret.txt");
        System.out.println("path1 is absolute? " + path1.isAbsolute());
        System.out.println("absolute from path1: " + path1.toAbsolutePath());

        Path path2 = Paths.get("birds/condor.txt");
        System.out.println("path2 is absolute?: " + path2.isAbsolute());
        System.out.println("absolute from path2: " + path2.toAbsolutePath());
    }
}
