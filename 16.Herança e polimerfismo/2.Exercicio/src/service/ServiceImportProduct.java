package service;

import dataBase.model.ImportedProduct;
import dataBase.model.Product;

public class ServiceImportProduct extends ServiceProduct {


    public double price(ImportedProduct importedProduct){
        Double total = importedProduct.getPrice() + importedProduct.getCustomsFee();
        return  total;

    }

    @Override

    public String priceTag(Product product){

        if(product instanceof ImportedProduct importedProduct){
            return "Name: " + importedProduct.getName() + ", price : " + importedProduct.getPrice() +  "(Customs fee : $ " +  importedProduct.getCustomsFee() + " total price : " + price(importedProduct);
        }
        return super.priceTag(product);

    }

}
