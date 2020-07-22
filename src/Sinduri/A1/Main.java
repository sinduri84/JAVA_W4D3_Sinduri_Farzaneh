package Sinduri.A1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        System.out.println("\nA1.");
        try {
            File file = new File("D:\\JAVA\\JAVA_W4D3_Sinduri_Farzaneh\\src\\Sinduri\\myFiles\\myFile.txt"); // Create file
            if (file.createNewFile()) { // Use createNewFile() method
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists");
            }
        } catch (Exception e) {
            System.out.println("An error occured");
            e.printStackTrace();
        }

        System.out.println("\nA2.");

        try {
            FileWriter file = new FileWriter("D:\\JAVA\\JAVA_W4D3_Sinduri_Farzaneh\\src\\Sinduri\\myFiles\\myFile.txt");
            file.write("Hello World!");
            file.close();
            System.out.println("Successfully wrote to file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }
}
