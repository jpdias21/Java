import dataBase.entity.Order;
import enums.Status;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        List<Order> orderList = new ArrayList<>();

        orderList.add(new Order("Joao", 3500.00, true, Status.Pending));
        orderList.add(new Order("Maria", 1200.00, true, Status.Pending));
        orderList.add(new Order("Carlos", 800.00, false, Status.Pending));
        orderList.add(new Order("Carlos", 2500.00, true, Status.Pending));
        orderList.add(new Order("Ana", 2500.00, true, Status.Pending));
        orderList.add(new Order("Pedro", 450.00, false, Status.Pending));
        orderList.add(new Order("Fernanda", 3200.00, true, Status.Pending));

        orderList.stream().filter(e -> e.isPaid()).forEach(e -> e.setStatus(Status.Processed));

        orderList.forEach(e -> System.out.println("Consumer:" + e.getCunsumer() + ", total:" + e.getTotal() +
                ", Status:" + e.getStatus() + ", Paid:" + e.isPaid()));
    }
}