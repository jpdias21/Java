package entities.PaymentProcess;

import entities.PaymentService.PaymentService;
import entities.enums.StatusPayment;

import java.sql.Timestamp;

import entities.AccountBusiness.Account;

import entities.enums.StatusPayment;
public class CreditCard extends PaymentProcess {
    private double taxCreditCard = 0.035;


    public CreditCard(double amount, Integer paymentId, StatusPayment statusPayment, Timestamp timestamp, Integer userId) {
        super(amount, paymentId, statusPayment, timestamp, userId);
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
    public String toString() {
        return "CreditCard{" +
                "taxCreditCard=" + taxCreditCard +
                ", amount=" + amount +
                ", paymentId=" + paymentId +
                ", statusPayment=" + statusPayment +
                ", timestamp=" + timestamp +
                ", userId=" + userId +
                '}';
    }
}
