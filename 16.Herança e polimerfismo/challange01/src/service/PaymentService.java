package service;

import model.AccountOfBussines.Account;

public class PaymentService {

    public void PaymentService(double amount,  Account account){

       double newBalance = amount + account.getBalance();
        account.setBalance(newBalance);
    }

}
