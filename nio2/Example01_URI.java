package nio2;

import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Example01_URI {
    public static void main(String[] args) throws URISyntaxException {
        Path path1 = Paths.get(new URI("file:///c:/zooinfo/November/employees.txt"));
        Path path2 = Paths.get(new URI("http://www.wiley.com"));
    }
}
