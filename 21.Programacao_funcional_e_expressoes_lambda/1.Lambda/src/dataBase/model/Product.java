package dataBase.model;

public class Product {

    private String name;
    private Double Value;

    public Product() {
    }

    public Product(String name, Double value) {
        this.name = name;
        Value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getValue() {
        return Value;
    }

    public void setValue(Double value) {
        Value = value;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", Value=" + Value +
                '}';
    }
}
