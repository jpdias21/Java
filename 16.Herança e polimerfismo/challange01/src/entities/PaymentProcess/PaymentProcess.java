package entities.PaymentProcess;


import entities.enums.StatusPayment;

import java.sql.Timestamp;

public class PaymentProcess {
  protected double amount;
  protected Integer userId;
  protected Integer paymentId;
  protected StatusPayment statusPayment;
  protected Timestamp timestamp;

    public PaymentProcess(double amount, Integer paymentId, StatusPayment statusPayment, Timestamp timestamp, Integer userId) {
        this.amount = amount;
        this.paymentId = paymentId;
        this.statusPayment = statusPayment;
        this.timestamp = timestamp;
        this.userId = userId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Integer getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(Integer paymentId) {
        this.paymentId = paymentId;
    }

    public StatusPayment getStatusPayment() {
        return statusPayment;
    }

    public void setStatusPayment(StatusPayment statusPayment) {
        this.statusPayment = statusPayment;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }



}
