package application;
import entities.Product;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Product p;
        p = new Product();
        Scanner sc = new Scanner(System.in);

        System.out.print("name of product :");
        p.name = sc.next();
        System.out.print("Price of product :");
        p.price = sc.nextDouble();
        System.out.print("Quantity of product : ");
        p.quantity = sc.nextInt();

        System.out.println(p);

        System.out.println("Enter the number of product to be added in stock : ");
        int quantity = sc.nextInt();
        p.addProducts(quantity);

        System.out.println(p.toStringQuantity());

        System.out.println("Remove the items : ");
        int removeProduct = sc.nextInt();

        p.removeProducts(removeProduct);
        System.out.println(p.toStringRemoveItem());

        sc.close();
    }
}