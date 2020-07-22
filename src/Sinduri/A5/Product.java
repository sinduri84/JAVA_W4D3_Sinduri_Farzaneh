package Sinduri.A5;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class Product {
    private static int staticID = 0;
    private int productID;
    private String productName;
    private double productPrice;
    private int productQuantity;
    private String productDescription;

    public static List<Product> productList = new ArrayList<>();

    public Product(String productName, double productPrice, int productQuantity, String productDescription) {
        staticID++;
        this.productID = staticID;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productQuantity = productQuantity;
        this.productDescription = productDescription;
        productList.add(this);
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public static void printReport() {

        try {
            FileWriter file = new FileWriter("./src/Sinduri/myFiles/productList.txt");
            PrintWriter printWriter = new PrintWriter(file);
            printWriter.printf("%n%-8s %-32s %-7s %-10s %-32s %n", "ID", "Name", "Price", "Quantity", "Description");
            for (Product product : productList) {
                printWriter.printf("%-8s %-32s %-7s %-10s %-32s %n", product.getProductID(), product.getProductName(),
                        product.getProductPrice(), product.getProductQuantity(), product.getProductDescription());
            }
            printWriter.close();
            file.close();
            System.out.println("Successfully wrote to file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }


    }
}
