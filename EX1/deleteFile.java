package EX1;

import java.io.File;

public class deleteFile {
    public static void main(String[] args) {
        File file = new File("newFile.txt");
        if (file.delete()) {
            System.out.println("Deleted the file: " + file.getName());
        } else {
            System.out.println("Failed to delete the file.");
        }
    }
}
