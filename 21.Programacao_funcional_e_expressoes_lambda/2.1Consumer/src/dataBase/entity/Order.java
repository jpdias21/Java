package dataBase.entity;

import enums.Status;

public class Order {

    protected  String cunsumer;
    protected  Double total;
    protected boolean paid;
    Status status;

    public Order(String cunsumer, Double total, boolean paid, Status status) {
        this.cunsumer = cunsumer;
        this.total = total;
        this.paid = paid;
        this.status = status;
    }

    public String getCunsumer() {
        return cunsumer;
    }

    public void setCunsumer(String cunsumer) {
        this.cunsumer = cunsumer;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public boolean isPaid() {
        return paid;
    }

    public void setPaid(boolean paid) {
        this.paid = paid;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
