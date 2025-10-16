package application;
import entities.Product;
public class Main {
    public static void main(String[] args) {
       Product product = new Product();

       product.setNameProduct("Geladeira");
       product.setPriceProduct(200.00);
       product.addStock(10);
       product.removeStock(3);

        System.out.println(product.getNameProduct());
        System.out.println(product.getPriceProduct());
        System.out.println(product.getStockProduct());

    }
}