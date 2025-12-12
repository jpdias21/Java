package entities.PaymentProcess;

import entities.enums.StatusPayment;

import java.sql.Timestamp;

public class DebitCard extends PaymentProcess {

    public DebitCard(double amount, Integer paymentId, StatusPayment statusPayment, Timestamp timestamp, Integer userId) {
        super(amount, paymentId, statusPayment, timestamp, userId);
    }
}
