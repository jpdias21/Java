package model.PaymentProcess;

import model.AccountOfBussines.Account;
import model.PaymentClient.Client;
import model.enums.MethodPayment;
import service.PaymentService;
import model.enums.StatusPayment;

import java.sql.Timestamp;

public class Ticket extends PaymentProcess {

    public Ticket(double amount, Integer paymentId, StatusPayment statusPayment, Timestamp timestamp, Integer userId, Client client) {
        super(amount, paymentId, statusPayment, timestamp, userId, client, MethodPayment.TICKET);
    }
    @Override
    public void process(Account account){
        double tax = 1.50;
        double netValue = amount - tax;

        PaymentService service = new PaymentService();
        service.PaymentService(netValue, account);

    }
}
