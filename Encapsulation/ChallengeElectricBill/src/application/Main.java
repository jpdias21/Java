package application;
import entities.ElectricBill;
public class Main {
    public static void main(String[] args) {

        ElectricBill e = new ElectricBill();

        e.setName("Joao Pedro");
        e.setAddress("Rua maria Paulo");
        e.setKwh(200.00);


        System.out.println(e.getName());
        System.out.println(e.getAddress());
        System.out.println(e.getKwh());
        System.out.println(e);

    }
}