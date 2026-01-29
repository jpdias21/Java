package model.PaymentProcess;


import model.AccountOfBussines.Account;
import model.PaymentClient.Client;
import model.enums.MethodPayment;
import model.enums.StatusPayment;

import java.sql.Timestamp;

public abstract class PaymentProcess {
  protected double amount;
  protected Integer userId;
  protected Integer paymentId;
  protected StatusPayment statusPayment;
  protected Timestamp timestamp;
  protected Client client;
  protected MethodPayment methodPayment;

    public PaymentProcess(double amount, Integer paymentId, StatusPayment statusPayment, Timestamp timestamp, Integer userId, Client client, MethodPayment methodPayment) {
        this.amount = amount;
        this.paymentId = paymentId;
        this.statusPayment = statusPayment;
        this.timestamp = timestamp;
        this.userId = userId;
        this.client = client;
        this.methodPayment = methodPayment;
    }

    public abstract void process(Account account);

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

    public Client getClient() {
        return client;
    }

    public MethodPayment getMethodPayment() {
        return methodPayment;
    }


}
