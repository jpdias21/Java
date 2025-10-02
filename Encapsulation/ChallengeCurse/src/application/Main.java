package application;
import entities.Transactions;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Transactions t = new Transactions();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter account number :");
        int numberAccount = sc.nextInt();
        t.setNumberAccount(numberAccount);

        System.out.println("Enter account holder :");
        String name = sc.next();
        t.setName(name);

        System.out.println("Is there initial deposit (y/n) ? ");
        String desopitYesNo = sc.next();
        if( desopitYesNo.equals("y")){
            System.out.println("Enter initical deposit");
            double initialDeposit = sc.nextDouble();
            t.setInitialDeposit(initialDeposit);
        }

        System.out.println(t.getAccountData());

        System.out.println("Enter a deposit value : ");
        double deposit = sc.nextDouble();
        t.setInitialDeposit(deposit);
        System.out.println(t.getUptadeAccount());

        System.out.println("Enter a withdraw value: ");
        double withdraw = sc.nextDouble();
        t.setwithdraw(withdraw);
        System.out.println(t.getUptadeAccount());
        sc.close();


    }
}