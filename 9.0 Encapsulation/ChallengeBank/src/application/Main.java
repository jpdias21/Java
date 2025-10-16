package application;
import  entities.Account;

public class Main {
    public static void main(String[] args) {

        Account c = new Account();
        c.setName("Joao");
        c.setCpf("8724238");

        c.Deposit(100.00);
        c.Remove(175.00);


        System.out.println(c.getName());
        System.out.println(c.getCpf());
        System.out.println(c.getBalance());
    }
}