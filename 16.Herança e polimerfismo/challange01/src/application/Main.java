package application;

import entities.AccountBusiness.Account;
import entities.PaymentProcess.CreditCard;
import entities.PaymentProcess.PaymentProcess;
import entities.PaymentService.PaymentService;
import entities.enums.StatusPayment;

import java.sql.Timestamp;

public class Main {
    public static void main(String[] args) {
        //Account
        Account acc1 = new Account(0.0, "Joao Pedro", 12312);

        //ucasting
        Timestamp dataDeHoje = new Timestamp(System.currentTimeMillis());
        PaymentProcess ac2 = new CreditCard(100,1, StatusPayment.Processing,dataDeHoje,01);

        //

        ((CreditCard) ac2).PaymentProcessCreditCart(100, acc1);



        System.out.println(ac2);
        System.out.println(acc1.getBalance());


    }
}