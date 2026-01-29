package model.PaymentProcess;

import model.AccountOfBussines.Account;
import model.PaymentClient.Client;
import model.enums.MethodPayment;
import service.PaymentService;
import model.enums.StatusPayment;

import java.sql.Timestamp;

public class DebitCard extends PaymentProcess {

    public DebitCard(double amount, Integer paymentId, StatusPayment statusPayment, Timestamp timestamp, Integer userId, Client client) {
        super(amount, paymentId, statusPayment, timestamp, userId, client, MethodPayment.DEBITCART);
    }
    @Override
    public void process(Account account){
        double tax = amount * 0;
        double netValue = amount - tax;

        PaymentService service = new PaymentService();
        service.PaymentService(netValue, account);

    }

}
