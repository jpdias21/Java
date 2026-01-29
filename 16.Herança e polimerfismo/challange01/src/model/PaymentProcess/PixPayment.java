package model.PaymentProcess;

import model.AccountOfBussines.Account;
import model.PaymentClient.Client;
import model.enums.MethodPayment;
import service.PaymentService;
import model.enums.StatusPayment;

import java.sql.Timestamp;

public class PixPayment extends PaymentProcess {

    private double taxPayment;

    public PixPayment(double amount, Integer paymentId, StatusPayment statusPayment, Timestamp timestamp, Integer userId, Client client) {
        super(amount, paymentId, statusPayment, timestamp, userId, client, MethodPayment.PIX);
        this.taxPayment = taxPayment;
    }

    public double getTaxPayment() {
        return taxPayment;
    }

    public void setTaxPayment(double taxPayment) {
        this.taxPayment = taxPayment;
    }
    @Override
    public void process(Account account){
        PaymentService service = new PaymentService();
        service.PaymentService(amount, account);

    }
}
