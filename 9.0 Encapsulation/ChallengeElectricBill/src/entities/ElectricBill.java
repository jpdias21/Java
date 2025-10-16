package entities;

public class ElectricBill {
    private String name;
    private String address;
    private double kwh;
    private double valueForKwh;

    private double withDiscount;
    private double totalBill;

    public ElectricBill(){
        kwh = 0.0;
        valueForKwh = 0.80;

    }
    public ElectricBill( String name, String address){        this();
        this.name = name;
        this.address = address;
    }


    ///
    public String getAddress() {
        return address;
    }

    public double getKwh() {
        return kwh;
    }

    public String getName() {
        return name;
    }

    public double getTotalBill() {
        return totalBill;
    }

    public double getValueForKwh() {
        return valueForKwh;
    }

    public double getWithDiscount() {
        return withDiscount;
    }

    ///
///
    public void setName(String newName){
        if(newName.isEmpty()){
            System.out.println("Voce colocou um vaio, nada");
            return;
        }
        name = newName;
    }
    public void setAddress(String newAddress){
        if(newAddress.isEmpty()){
            System.out.println("Voce colocou um vaio, nada");
            return ;
        }
        address = newAddress;
    }
    public void setKwh(double newKwh){
        kwh = newKwh;
        calculateBill(kwh);
    }

    public void calculateBill(double newKwh){
            double calculation = newKwh * valueForKwh;
            this.totalBill = calculation;

            applyDiscount();
    }

    public void applyDiscount(){
        double calculation = this.totalBill * 0.10;
        this.withDiscount = this.totalBill - calculation;
    }

    public String toString(){
       return "sua conta final é " + String.format("%.2f",getWithDiscount());
    }



}
