package EX1;

import java.io.File;
import java.io.IOException;

public class createFile {
    public static void main(String[] args) throws IOException {
        File file = new File("newFile.txt");
        if (file.createNewFile()) {
            System.out.println("File created: " + file.getName());
        } else {
            System.out.println("File already exists.");
        }
    }
}
