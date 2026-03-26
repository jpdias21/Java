package service;

import dataBase.model.Product;

public class ServiceProduct {

    public String priceTag(Product product){

      return   "Name: " + product.getName() + ", price : " + product.getPrice();
    }
}
