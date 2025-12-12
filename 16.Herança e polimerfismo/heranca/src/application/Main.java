package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Main {
    public static void main(String[] args) {

        Account acc = new Account(0.0, "Joao", 2002);

        BusinessAccount bacc = new BusinessAccount(0.0, "Maria", 10, 500);

        //Upcasting

        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(2.0, "Renata", 20, 1000);
        Account acc3 = new SavingsAccount(10.0, "Pedro", 2002, 1000);

        System.out.println(acc1.getBalance());
        System.out.println(acc2.getHolder());

        //DownCasting

        BusinessAccount acc4 = (BusinessAccount) acc2;
        acc4.loan(100);
        System.out.println(acc4.getHolder());
        System.out.println(acc4.getBalance());

     //   BusinessAccount acc5 = (BusinessAccount) acc3;


        if(acc3 instanceof  BusinessAccount){
            BusinessAccount acc5 = (BusinessAccount) acc3;
            acc5.loan(200);
            System.out.println("Loan");
        }

        if(acc3 instanceof  SavingsAccount){
            SavingsAccount acc5 = (SavingsAccount) acc3;
            acc5.updateBalance();
            System.out.println("Uptade");
        }


    }
}