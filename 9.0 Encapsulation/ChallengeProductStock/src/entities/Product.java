package entities;

public class Product {
    private String nameProduct;
    private double priceProduct ;
    private int stockProduct;

    public Product (){
        stockProduct = 0;
    }
    public Product(String nameProduct, double priceProduct){
        this();
        this.nameProduct = nameProduct;
        this.priceProduct = priceProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }
    public double getPriceProduct(){
        return priceProduct;
    }
    public int getStockProduct(){
        return stockProduct;
    }

    public void setNameProduct(String newName){
        if(newName.isEmpty()){
         return;   System.out.println("Voce colocou o nome vazio");
        }
        nameProduct = newName;
    }
    public void setPriceProduct(double newPrice){
        if(newPrice <= 0.00){
            System.out.println("nao coloque um preço 0 ou negativo");
        }else {
        priceProduct = newPrice;
        }
    }
    //
    public void addStock(int quantity){
        if(quantity <= 0 ){
            System.out.println("so aceitamos numeros positivos");
        }else{
            stockProduct += quantity;
        }
    }

    public void removeStock(int quantityRemove){
        if(quantityRemove > stockProduct){
            System.out.println("voce esta tentando remover a mais to que tem no estoque");
        } else if (quantityRemove == 0 ) {
            System.out.println("voce colocou um numero 0");
            return;
        }
            stockProduct -= quantityRemove;

    }


}
