package Sinduri.A5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static Sinduri.A5.Product.printReport;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("Orange Juice", 2.56, 20, "Juice that comes from Oranges");
        Product product2 = new Product("Chicken Drumsticks", 8.24, 5, "A part of chicken");
        Product product3 = new Product("Beer", 2.89, 50, "Juice that makes you happy");
        Product product4 = new Product("Sugar", 3.95, 30, "We all need some sugar in life");
        Product product5 = new Product("Green Tea", 9.85, 25, "Expensive Tea to wake you up");
        Product product6 = new Product("Chamomile Tea", 17.56, 40, "Expensive Tea to make you relax");
        Product product7 = new Product("Sparkling Water", 4.23, 10, "When you need more than good old Tap water");
        Product product8 = new Product("Eggs", 5.56, 50, "Easy to cook and easy to eat");
        Product product9 = new Product("Cotton Face Mask", 4.8, 90, "Wear a mask and protect the people around you");


        try {
            File file = new File("./src/Sinduri/myFiles/productList.txt"); // Create file
            if (file.createNewFile()) { // Use createNewFile() method
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists");
            }

            printReport();

        } catch (Exception e) {
            System.out.println("An error occured");
            e.printStackTrace();
        }

        System.out.println("\nA6.");

        //Using Files.readString API - In Java 11
        Path fileName = Path.of("./src/Sinduri/myFiles/productList.txt");
        String readString = null;
        try {
            readString = Files.readString(fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(readString);

        //Using BufferedReader to read File tline by line - In Java 6
        StringBuilder contentBuilder = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader("./src/Sinduri/myFiles/productList.txt"))) {
            String sCurrentLine;
            while((sCurrentLine = br.readLine()) != null) {
                contentBuilder.append(sCurrentLine).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(contentBuilder.toString());


        //Using readFileAsString

    }
}
