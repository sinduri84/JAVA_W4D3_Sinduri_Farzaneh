package Farzaneh.A4;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        File file = new File("src/Farzaneh/A4/myFile.text");
        if (file.delete()) {
            System.out.println("file Deleted: " + file.getName());
        } else {
            System.out.println("No file");
        }
    }
}
