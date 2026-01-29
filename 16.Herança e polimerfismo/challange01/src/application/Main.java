package application;


import infra.dao.AccountDAO;
import infra.dao.PaymentIssuedDAO;
import model.AccountOfBussines.Account;
import model.PaymentClient.Client;
import model.PaymentProcess.CreditCard;
import model.PaymentProcess.PaymentProcess;
import model.enums.StatusPayment;

import java.sql.SQLException;
import java.sql.Timestamp;

public class Main {
    public static void main(String[] args) throws SQLException {
//        //Account
//        Account acc1 = new Account(0.0, "Joao Pedro", 12312);
//
//        //ucasting
//        Timestamp dataDeHoje = new Timestamp(System.currentTimeMillis());
//
//        PaymentProcess ac2 = new CreditCard(1000,1, StatusPayment.Processing,dataDeHoje,01);
//
//        PaymentProcess ac3 = new PixPayment(250,01, StatusPayment.Processing, dataDeHoje, 001);
//
//        PaymentProcess ac4 = new DebitCard(300, 001, StatusPayment.Processing, dataDeHoje, 00071);
//
//        PaymentProcess ac5 = new Ticket(500, 001, StatusPayment.Processing,dataDeHoje, 200) ;
//        //
//        ac2.process(acc1);
//        ac3.process(acc1);
//        ac4.process(acc1);
//        ac5.process(acc1);

//        Account acc = new Account(20.00, "Maria", 3545);
//        /  /
//
//        AccountDAO doa = new AccountDAO();
//
//        doa.save(acc);
//        System.out.println("Conta criada com ID: " + acc.getIdAccountBD());

        // 1. Create account
        Account acc = new Account(20.00, "Maria", 3545);
        AccountDAO accountDAO = new AccountDAO();
        accountDAO.save(acc);
        System.out.println("✅ Account created ID: " + acc.getIdAccountBD());

        // 2. Create client
        Client client = new Client("joao@email.com", "João", "Silva");
        Timestamp now = new Timestamp(System.currentTimeMillis());

        // 3. Create payment (upcasting)
        PaymentProcess payment = new CreditCard(
                100.00,
                null,
                StatusPayment.Peding,
                now,
                null,
                client
        );

        // 4. Save payment
        PaymentIssuedDAO paymentDAO = new PaymentIssuedDAO();
        paymentDAO.save(payment);
        System.out.println("✅ Payment saved!");
        System.out.println("Payment ID generated: " + payment.getPaymentId());  // ← Check this!

        // 5. Find payment
        PaymentProcess found = paymentDAO.findById(1);

        // 6. NULL CHECK! (IMPORTANT!)
        if(found == null) {
            System.out.println("❌ ERROR: Payment not found in database!");
            System.out.println("Check:");
            System.out.println("1. Was payment saved? Check save() method");
            System.out.println("2. Check database - is there a row with id=1?");
            System.out.println("3. Check findById() SQL query");
            return;  // ← Stop here!
        }

        // 7. Print results (only if found)
        System.out.println("\n✅ Payment found:");
        System.out.println("Client: " + found.getClient().getName());
        System.out.println("Amount: " + found.getAmount());
        System.out.println("Method: " + found.getMethodPayment());


    }
}