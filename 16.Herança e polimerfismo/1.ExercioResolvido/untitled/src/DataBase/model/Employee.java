package DataBase.model;

public class Employee {

    protected String name;
    protected Integer hour;
    protected Double valuePerHour;
    protected Double payment;

    public Employee(){
        super();
    }
    public Employee(Integer hour, String name, Double valuePerHour) {
        super();
        this.hour = hour;
        this.name = name;
        this.valuePerHour = valuePerHour;
    }


    public Integer getHour() {
        return hour;
    }

    public void setHour(Integer hour) {
        this.hour = hour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getValuePerHour() {
        return valuePerHour;
    }

    public void setValuePerHour(Double valuePerHour) {
        this.valuePerHour = valuePerHour;
    }

    public Double getPayment() {
        return payment;
    }

    public void setPayment(Double payment) {
        this.payment = payment;
    }
}
