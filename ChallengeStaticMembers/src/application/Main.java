package application;

import java.util.Scanner;
import utils.CurrencyConverter;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("How many dollars will be bought");
        double dollarCurrency = sc.nextDouble();

        double dollarConvert = CurrencyConverter.calculationDollar(dollarCurrency);

        System.out.println("dollar price: " + CurrencyConverter.dollar);
        System.out.println("Amount to be paid in reais: R$" + dollarConvert + " reais");
        sc.close();
    }
}