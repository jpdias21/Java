package model.entities;

import model.enums.Status;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Order {
   private LocalDate localDate;
   private Status status;
    private Client client;
    List<OrderItem> orderItems = new ArrayList<>();

    public Order(LocalDate localDate, Status status, Client client) {
        this.localDate = localDate;
        this.status = status;
        this.client = client;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Client getClient() {
        return client;
    }
    public void addOrderItem(OrderItem orderItem){
        orderItems.add(orderItem);
    }
    public void removeOrderItem(OrderItem orderItem){
        orderItems.add(orderItem);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("ORDER SUMMARY\n");
        sb.append("Order moment: ").append(localDate).append("\n");
        sb.append("Order status: ").append(status).append("\n");
        sb.append("Client: ").append(client.getName()).append("\n");
        sb.append("Items:\n");

        for(OrderItem item : orderItems) {
            sb.append(item).append("\n");
        }

        return sb.toString();
    }
}
