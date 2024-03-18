package EX1;

import java.io.FileWriter;
import java.io.IOException;

public class writeData {
    public static void main(String[] args) {
        try {
            FileWriter input = new FileWriter("newFile.txt");
            input.write("Exercise: file I/O");
            input.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
