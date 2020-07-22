package Farzaneh.A1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            File file = new File ("C:/Users/A/IdeaProjects/JAVA_W4D3_Sinduri_Farzaneh/src/Farzaneh/" +
                    "A1/my_files/myFile.txt");
            if (file.createNewFile()) {
                System.out.println("New file created: " + file.getName());
            }else  {
                System.out.println("File already exists");
            }

        }   catch (Exception x) {
            System.out.println("An error occured");
            x.printStackTrace();
        }

        try {
            FileWriter file = new FileWriter("C:/Users/A/IdeaProjects/JAVA_W4D3_Sinduri_Farzaneh/src/Farzaneh/" +
                    "A1/my_files/myFile.txt");
            file.write("Hello World");
            file.close();
            System.out.println("Done");
        } catch (IOException x) {
            System.out.println("An error occured");
            x.printStackTrace();
        }


    }
}
