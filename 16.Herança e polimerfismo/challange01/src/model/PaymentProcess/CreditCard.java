package model.PaymentProcess;

import model.PaymentClient.Client;
import model.enums.MethodPayment;
import service.PaymentService;
import model.enums.StatusPayment;

import java.sql.Timestamp;

import model.AccountOfBussines.Account;

public class CreditCard extends PaymentProcess {
    private double taxCreditCard = 0.035;


    public CreditCard(double amount, Integer paymentId, StatusPayment statusPayment, Timestamp timestamp, Integer userId, Client client) {
        super(amount, paymentId, statusPayment, timestamp, userId, client, MethodPayment.CREDITCART);
        this.taxCreditCard = taxCreditCard;
    }

    public double getTaxCreditCart() {
        return taxCreditCard;
    }

    public void setTaxCreditCart(double taxCreditCart) {
        this.taxCreditCard = taxCreditCart;
    }

    public void PaymentProcessCreditCart(double amount, Account account){
        double tax = amount * getTaxCreditCart();
        double netValue = amount - tax;

        PaymentService service = new PaymentService();
        service.PaymentService(netValue, account);

    }

    @Override
    public void process(Account account){
        double tax = amount * getTaxCreditCart();
        double netValue = amount - tax;

        PaymentService service = new PaymentService();
        service.PaymentService(netValue, account);

    }
}
