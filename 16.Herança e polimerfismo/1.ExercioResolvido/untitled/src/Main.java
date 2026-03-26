import DataBase.model.Employee;
import DataBase.model.OutSourceEmployee;
import factory.EmployeeFatory;
import service.ServiceEmployee;
import service.ServiceOutSourceEmployee;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        List<Employee> listEmployee = new ArrayList<>();

        String name;
        Integer hours;
        Double valueForHour;
        Double additional;
        Integer numberEmployee;
        String tipo;

     //   ServiceEmployee serviceEmployee = new ServiceOutSourceEmployee();

        ServiceEmployee serviceEmployee;

        EmployeeFatory employeeFatory = new EmployeeFatory();


        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of employee :");
        numberEmployee = sc.nextInt();

        for (int i = 0 ; i < numberEmployee; i++) {
            System.out.println("Employee #" + (i + 1) + " data:");

            System.out.println("Name: ");
            name = sc.next();

            System.out.println("Hours: ");
            hours = sc.nextInt();

            System.out.println("Value por hour:");
            valueForHour = sc.nextDouble();


            System.out.println("Outsource (y/n) :");
            String answer = sc.next();

            if (answer.equals("y")) {

                tipo = "outEmployee";
                System.out.println("additional  charge: ");
                additional = sc.nextDouble();

                OutSourceEmployee outSourceEmployee = new OutSourceEmployee(hours, name, valueForHour, additional);

                listEmployee.add(outSourceEmployee);

                serviceEmployee = EmployeeFatory.create(tipo);

               serviceEmployee.paymentEmployee(outSourceEmployee);

            } else {
                tipo ="employee";

                Employee employee = new Employee(hours, name, valueForHour);
                listEmployee.add(employee);

                serviceEmployee = EmployeeFatory.create(tipo);
                serviceEmployee.paymentEmployee(employee);

            }

        }

        NumberFormat brazil = NumberFormat.getCurrencyInstance();
        for (Employee e : listEmployee) {
            System.out.println("=============");
            System.out.println(e.getName());
            System.out.println(e.getHour());
            System.out.println(e.getValuePerHour());
            if(e instanceof OutSourceEmployee out){
                System.out.println("additional " + brazil.format(out.getAdditional()));
            }
            System.out.println("paymenty: " + brazil.format(e.getPayment()));
            System.out.println("=============");
        }
    }
}