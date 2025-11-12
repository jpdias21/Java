package application;

import entities.ContractWork;
import entities.Department;
import entities.WorkerData;
import entities.WorkerLevel;
import org.w3c.dom.ls.LSOutput;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String departmentName; String name; int level; double baseSalary;
        System.out.println("Enter department's name:");
        departmentName = sc.next();

        System.out.println("Enter work data:");
        System.out.println("Name:");
        name = sc.next();

        System.out.println("Enter level: 1.Junior / 2.Mid_level / 3.Senior");
        WorkerLevel workerLevel = null;
        level = sc.nextInt();
       if(level == 1){
           workerLevel = WorkerLevel.MID_LEVEL;
       } else if (level == 2) {
           workerLevel = WorkerLevel.JUNIOR;
       } else if (level ==3) {
           workerLevel = WorkerLevel.SENIOR;
       }

        System.out.println("Base salary:");
        baseSalary = sc.nextDouble();

        Department department = new Department(departmentName);
        WorkerData workerData = new WorkerData(name, baseSalary,workerLevel );
//////

        int contractWorker; String data; double valeuWork; int houresWorker;

        System.out.println("How many contract to this worker ?");
        contractWorker = sc.nextInt();

        for(int i = 0; i < contractWorker; i++){
            System.out.println("Enter contract #" + (1+i)+ " data:");
            System.out.println("Exemple 09/07/2020, Data:");
            data = sc.next();
            DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate dataText = LocalDate.parse(data, fmt);

            System.out.println("value for hour:");
            valeuWork = sc.nextDouble();

            System.out.println("Duration (houres): ");
            houresWorker = sc.nextInt();

            ContractWork contractWork = new ContractWork(dataText,valeuWork,houresWorker);
            workerData.addContract(contractWork);
        }

        System.out.println();
        System.out.print("Enter month and year to calculate income (MM/YYYY): ");
        String monthAndYear = sc.next();
        int month = Integer.parseInt(monthAndYear.substring(0, 2));
        int year = Integer.parseInt(monthAndYear.substring(3));

        System.out.println("Name: " + workerData.getName());
        System.out.println("Department: " + department.getDepartment() );

        System.out.println("Income for " + monthAndYear + ": R$" + String.format("%.2f", workerData.income(year, month)));
////
        System.out.println("-----------------");
        System.out.println(workerData);
        sc.close();
    }

}