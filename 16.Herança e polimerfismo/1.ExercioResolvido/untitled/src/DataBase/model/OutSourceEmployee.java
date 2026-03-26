package DataBase.model;

public class OutSourceEmployee extends Employee {

    protected Double additional;

    public OutSourceEmployee(){
        super();
    }


    public OutSourceEmployee(Integer hour, String name, Double valuePerHour, Double additional) {
        super(hour, name, valuePerHour);
        this.additional = additional;
    }

    public Double getAdditionalCharge() {
        return additional;
    }

    public void setAdditionalCharge(Double additional) {
        this.additional = additional;
    }

    public Double getAdditional() {
        return additional;
    }

    public void setAdditional(Double additional) {
        this.additional = additional;
    }

}
