package entities.PaymentProcess;

import entities.enums.StatusPayment;

import java.sql.Timestamp;

public class PixPayment extends PaymentProcess {

    private double taxPayment;

    public PixPayment(double amount, Integer paymentId, StatusPayment statusPayment, Timestamp timestamp, Integer userId, double taxPayment) {
        super(amount, paymentId, statusPayment, timestamp, userId);
        this.taxPayment = taxPayment;
    }

    public double getTaxPayment() {
        return taxPayment;
    }

    public void setTaxPayment(double taxPayment) {
        this.taxPayment = taxPayment;
    }
}
