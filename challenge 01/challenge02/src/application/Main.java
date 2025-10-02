package application;
import entities.Salary;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Salary s;
        s = new Salary();

        Scanner sc = new Scanner(System.in);

        System.out.println("whats your name: ");
        s.name = sc.next();

        System.out.println("whats your salary :");
        s.grossSalary = sc.nextDouble();

        System.out.println(s.toEmployee());

        System.out.println("Which percentual to increase salary ? ");
        double increaseSalaryEmployee  = sc.nextDouble();
        s.increaseSalary(increaseSalaryEmployee);

        System.out.println(s.toIncreaseSalary());
        sc.close();
    }
}