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

        System.out.println("Product data: " + p.name + " $" + p.price + ", " + p.quantity + "units, Total: $" + p.totalValueInStock() );

        System.out.print(Product);
        sc.close();
    }
}