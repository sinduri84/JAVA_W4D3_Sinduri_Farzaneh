package Sinduri.A7;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Creates new file
        // Try and Catch block to handle the checked exception
        try {
            File file = new File("./src/Sinduri/myFiles/newtList.txt"); // Create file
            if (file.createNewFile()) { // Use createNewFile() method
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists");
            }
        } catch (Exception e) {
            System.out.println("An error occurred");
            e.printStackTrace();
        }


        //Writes sorted List into a new File;
        try {
            FileWriter file = new FileWriter("./src/Sinduri/myFiles/newtList.txt");
            for(String string: readListSort("./src/Sinduri/myFiles/words.txt")) {
                file.write(string + "\n");
            }
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //Reads the new File;
        readFile("./src/Sinduri/myFiles/newtList.txt");


    }

    public static List<String> readListSort(String filePath) {
        //Using BufferReader
        List<String> readLines = new ArrayList<>();
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(filePath));
            String sCurrentLine;
            while ((sCurrentLine = reader.readLine()) != null) {
                readLines.add(sCurrentLine);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Collections.sort(readLines);
        return readLines;
    }

    public static void readFile(String fileName) {
        //Using BufferReader
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(fileName));
            String sCurrentLine;
            while((sCurrentLine = reader.readLine()) != null) {
                System.out.println(sCurrentLine);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
