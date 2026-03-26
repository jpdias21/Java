import dataBase.model.ImportedProduct;
import dataBase.model.Product;
import dataBase.model.UsedProduct;
import factory.FactoryProduct;
import service.ServiceImportProduct;
import service.ServiceProduct;

import java.security.Provider;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        List<Product> listProduct = new ArrayList<>();

        String name;
        Double price;
        Double customFee;
        String factoreDate;
        LocalDate manufactoreDate;

        Integer numberOfProduct;
        String answer;

        Product product = new Product();
        FactoryProduct factoryProduct = new FactoryProduct();
        ServiceProduct serviceProduct = new ServiceProduct();


        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of product: ");

        numberOfProduct = sc.nextInt();

        for(int i = 0 ; i < numberOfProduct; i++){

            System.out.print("Product #" + (i+1) + " data:");
            System.out.println("Common, used or imported (c/u/i) ? ");

            answer = sc.next();

            if(answer.equals("c")){
                String tipo = "c";

                System.out.println("Name:");
                name = sc.next();

                System.out.println("Price:");
                price = sc.nextDouble();

                product = new Product(name, price);
                listProduct.add(product);

              serviceProduct =  factoryProduct.create(tipo);


            }else if(answer.equals("i")){
                String tipo = "i";

                System.out.println("Name:");
                name = sc.next();

                System.out.println("Price:");
                price = sc.nextDouble();

                System.out.println("Customs fee:");
                customFee = sc.nextDouble();

                ImportedProduct importedProduct = new ImportedProduct(name, price, customFee);
                listProduct.add(importedProduct);
                serviceProduct =  factoryProduct.create(tipo);

            } else if(answer.equals("u")){
                String tipo = "u";
                System.out.println("Name:");
                name = sc.next();

                System.out.println("Price:");
                price = sc.nextDouble();

                System.out.println("Manufacture data (DD/MM/YYY): ");
                factoreDate = sc.next();

                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

                manufactoreDate = LocalDate.parse(factoreDate, formatter);

                UsedProduct usedProduct = new UsedProduct(name, price, manufactoreDate);

                listProduct.add(usedProduct);
                serviceProduct =  factoryProduct.create(tipo);

            }


        }

        for(Product p : listProduct){
            System.out.println(serviceProduct.priceTag(p));
        }

    }
}