import dataBase.model.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        List<Product> list = new ArrayList<>();

        list.add(new Product("Computer", 2000.00));
        list.add(new Product("Mobile", 699.00));
        list.add(new Product("Tablet", 499.99));
        list.add(new Product("Camara", 3999.99));

        list.sort((p1 , p2) -> p1.getName().compareTo(p2.getName()));
        for(Product p : list){
            System.out.println(p );
        }


    }
}