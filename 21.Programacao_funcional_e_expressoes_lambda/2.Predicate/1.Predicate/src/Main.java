import dataBase.model.Product;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("Macbook", 2500.00));
        list.add(new Product("Iphone", 1400.00));
        list.add(new Product("Imac", 1499.00));
        list.add(new Product("Rog", 999.99));


        list.stream().filter(p -> p.getPrice() >= 1000.00).forEach(p -> System.out.println(p));

        System.out.println( list.stream().anyMatch(p -> p.getPrice() > 2499.00));



    }
}

