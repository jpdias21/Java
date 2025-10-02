package application;
import entities.Product;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.print("name of product :");
        String name = sc.next();
        System.out.print("Price of product :");
        double price = sc.nextDouble();
        System.out.print("Quantity of product : ");
        int quantity = sc.nextInt();

        Product product = new Product(name, price, quantity);

        System.out.println("Enter the number of product to be added in stock : ");
        quantity = sc.nextInt();
        product.addProducts(quantity);

        System.out.println(product.toStringQuantity());

        System.out.println("Remove the items : ");
        int removeProduct = sc.nextInt();

        product.removeProducts(removeProduct);
        System.out.println(product.toStringRemoveItem());

        sc.close();
    }
}