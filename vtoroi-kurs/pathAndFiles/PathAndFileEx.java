package pathAndFiles;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathAndFileEx {
    public static void main(String[] args) throws IOException {
        Path filePath = Paths.get("test.txt");
        Path directoryPath = Paths.get("DESKTOP-PQIA4O8\\Users\\Wind\\Desktop\\Новая папка (2)");
        Files.copy(filePath,directoryPath.resolve(filePath));
        System.out.println("done!");
    }
}
