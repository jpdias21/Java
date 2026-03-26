package service;

import dataBase.model.ImportedProduct;
import dataBase.model.Product;
import dataBase.model.UsedProduct;

public class ServiceUsedProduct extends ServiceProduct {

    @Override
        public String priceTag(Product product){

        if(product instanceof UsedProduct usedProduct){

            return "Name: " + usedProduct.getName() + "(used)" + ", price : " + usedProduct.getPrice() + " (Manufactore date: " + usedProduct.getDate() + ")";
        }

        return  super.priceTag(product);

    }
}


