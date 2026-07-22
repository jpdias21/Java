import dataBase.model.Product;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        List<Product> list = new ArrayList<>();

        list.add(new Product("Notebook", 200.00));
        list.add(new Product("Mobibe", 100.00));
        list.add(new Product("Bike", 434.00));
        list.add(new Product("Notebook", 200.00));


        list.sort((p1, p2) -> { return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
        });

        for(Product p : list){
            System.out.println(p);
        }

        list.sort((p1, p2) -> { return Double.compare(p1.getValue(), p2.getValue());});

        System.out.println("======= Value =====");
        for (Product n : list){
            System.out.println(n);
        };
    }
}