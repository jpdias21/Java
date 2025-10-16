package application;

import entities.Product;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("How many product do you want to enter : ");
        int howProduct = sc.nextInt();

        Product[] vector = new Product[howProduct];

        for( int i = 0; i < howProduct; i++){
            sc.nextLine();
            String name = sc.nextLine();

            double price = sc.nextDouble();

            vector[i] = new Product(name, price);
        }

        double sum = 0.0;

        for(int i = 0 ; i < howProduct ; i++){
            sum += vector[i].getPrice();
        }

        double ave = sum / howProduct;

        System.out.println("Average price: " + ave);

        sc.close();
    }
}