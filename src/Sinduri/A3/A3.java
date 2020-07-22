package Sinduri.A3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class A3 {

    static void countString(String findString, String filePath) {
        try {
            int count = 0;
            File file2  = new File(filePath);
            Scanner scanner = new Scanner(file2);
            while (scanner.hasNext()) {
                String output = scanner.next();
                if(output.startsWith(findString)) {
                    count++;
                }
            }
            System.out.println(findString + " was found " + count + " times in the file.");
            scanner.close();
        } catch (FileNotFoundException e) { // Catch the exception
            System.out.println("Error occurred");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        try {
            File file1 = new File("./src/Sinduri/myFiles/readme.txt"); // Create file object
            Scanner scanner = new Scanner(file1); // Create new scanner object
            while (scanner.hasNext()) { // While condition
                String output = scanner.next(); // Save lines read
                System.out.print(output + " "); // Output lines read
                if(output.endsWith(":") || output.endsWith(("egg"))) {
                    System.out.println("");
                }
            }
            scanner.close(); // Close the scanner
        } catch (FileNotFoundException e) { // Catch the exception
            System.out.println("Error occurred");
            e.printStackTrace();
        }

        System.out.println("\n\n");

        countString("egg", "./src/Sinduri/myFiles/readme.txt");
    }
}
