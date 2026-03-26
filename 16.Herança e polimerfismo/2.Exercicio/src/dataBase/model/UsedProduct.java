package dataBase.model;

import java.time.LocalDate;

public class UsedProduct extends Product{
    protected LocalDate Date;

    public UsedProduct(String name, Double price, LocalDate date) {
        super(name, price);
        Date = date;
    }

    public LocalDate getDate() {
        return Date;
    }

    public void setDate(LocalDate date) {
        Date = date;
    }
}
