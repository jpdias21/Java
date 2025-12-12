package entities.PaymentService;

import entities.AccountBusiness.Account;

public class PaymentService {

    public void PaymentService(double amount,  Account account){

       double newBalance = amount + account.getBalance();
        account.setBalance(newBalance);
    }

}
