package model.entities;

import java.util.ArrayList;
import java.util.List;

public class OrderItem {
    private Integer quantity;
    private Double price ;
    private Product product;

    public OrderItem(Double price, Integer quantity, Product product) {
        this.price = price;
        this.quantity = quantity;
        this.product = product;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
    @Override
    public String toString() {
        return product.getName() +
                ", $" + String.format("%.2f", price) +
                ", Quantity: " + quantity +
                ", Subtotal: $" + String.format("%.2f", quantity * price);
    }
}
