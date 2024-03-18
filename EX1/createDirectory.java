package EX1;

import java.io.File;

public class createDirectory {
    public static void main(String[] args) {
        File myObj = new File("newFolder");
        if (myObj.mkdir()) {
            System.out.println("Created directory: " + myObj.getName());
        } else {
            System.out.println("Failed to create directory.");
        }
    }
}
