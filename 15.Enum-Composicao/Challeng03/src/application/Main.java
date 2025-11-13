package application;


import model.entities.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;
import model.entities.OrderItem;
import model.enums.Status;

public class Main {
    public static void main(String[] args) {
        String name;String email; String dataOfBirth;


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter cliente data:");
        System.out.println("Name:");
        name = sc.next();

        System.out.println("Email:");
        email = sc.next();

        System.out.println("Birth data (DD/MM/YYYY):");
        dataOfBirth = sc.next();


        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate birthDate = LocalDate.parse(dataOfBirth, fmt);

        Client client = new Client(name, email, birthDate);
        LocalDate date = LocalDate.now();

        Order order = new Order(date, Status.PENDIND_PAYMENT, client );

        System.out.println("How many items to this order ?");
        int n = sc.nextInt();
        String productName; double productPrice; int quantity;
        for(int i = 0; i < n ; i++){
            System.out.println("Procduct name:");
            productName = sc.next();

            System.out.println("Product price");
            productPrice = sc.nextDouble();

            System.out.println("Quantity:");
            quantity = sc.nextInt();

            Product product = new Product(productName, productPrice);
            OrderItem item = new OrderItem(productPrice,quantity, product);
           order.addOrderItem(item);

        }

        sc.close();
        System.out.println(order);
    }
}