package EX1;

import java.io.File;

public class getPath {
    public static void main(String[] args) {
        File file = new File("newFile.txt");
        String filePath = file.getAbsolutePath();
        System.out.println("File path: " + filePath);
    }
}
