package factory;

import dataBase.model.ImportedProduct;
import service.ServiceImportProduct;
import service.ServiceProduct;
import service.ServiceUsedProduct;

public class FactoryProduct {

    public static ServiceProduct create(String tipo){
        if (tipo.equals("c")) {
            return  new ServiceProduct();
        }
        if (tipo.equals("i")) {

            return new ServiceImportProduct();
        }
        if (tipo.equals("u")) {
            return  new ServiceUsedProduct();
        }
        return  null;
    }



}
