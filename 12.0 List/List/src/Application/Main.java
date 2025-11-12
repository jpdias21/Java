package Application;

import entities.SalaryIncrease;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;

import static entities.SalaryIncrease.IncreaseEmployeeSalary;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    //   ArrayList<Integer> number = new ArrayList<>();


    //   Scanner sc = new Scanner(System.in);
    //   System.out.println("Quantos numeros voce ira digitar ? ");
    //   int n = sc.nextInt();

    //   for(int i = 0 ; i < n ; i++){
    //       System.out.println("Digite o numero da posicao " + (i) + ": ");
    //       int newNumber = sc.nextInt();
    //       number.add(newNumber);
    //   }
    //   System.out.println(number);
    //   System.out.println("---Array List---");

    //   number.add(2, 23);
    //   System.out.println(number);
    //   System.out.println("---Add no ArrayList---");


    //   number.remove(2);
    //   System.out.println(number);
    //   System.out.println("--- Remove ---");

    //   number.remove(Integer.valueOf(222));
    //   System.out.println(number);
    //   System.out.println("--- Remove Obj---");

    //   System.out.println( "Encontrar a posicao do elemento " + number.indexOf(123));

    //   System.out.println("Encontrar e ultima posicao do elemento : " + number.lastIndexOf(123));
    //   sc.close();

        Scanner sc = new Scanner(System.in);
        System.out.println("How mny employees will be registered ?");
        int n = sc.nextInt();
        ArrayList<SalaryIncrease> salaryIncreases = new ArrayList<>();

        for (int i = 0 ; i < n ; i++){
            sc.nextLine();
            System.out.println("employee " + (i+1) + " :");
            int id = sc.nextInt();
            String name = sc.next();;
            double salary = sc.nextDouble();

            salaryIncreases.add(new SalaryIncrease(id,name, salary));
        }

        System.out.println("Enter your emploee id  : ");
        int numberId = sc.nextInt();
        SalaryIncrease emp = SalaryIncrease.FindById(salaryIncreases, numberId);

        if(emp != null){
            System.out.println("Enter the percentage: ");
            double percentage = sc.nextDouble();
            double calculo = IncreaseEmployeeSalary(emp.getSalary(), percentage);
            emp.setSalary(calculo);
            System.out.println("New salary: " + emp.getSalary());
        }else{
            System.out.println("ther is no employee with this ID");
        }

        System.out.println("\n📋 Lista de funcionários atualizada:");
        for (SalaryIncrease e : salaryIncreases) {
            System.out.println(e);
        }



        sc.close();
    }
}