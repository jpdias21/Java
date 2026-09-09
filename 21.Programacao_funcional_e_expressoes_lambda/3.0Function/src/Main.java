import dataBase.entity.Employee;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(new Employee("Joao", 2300.00, true));
        employeeList.add(new Employee("Maria", 2600.00, false));
        employeeList.add(new Employee("Milena", 1800.00, true));
        employeeList.add(new Employee("Jorlan", 3500.00, true));
        employeeList.add(new Employee("Rodrigo", 6900.00, false));
        employeeList.add(new Employee("Renato", 12000.00, true));

        employeeList.stream().map(e -> e.getSalary() * 12).forEach(System.out::println);

        employeeList.forEach(e ->
                System.out.println(
                        "Nome: " + e.getName() +
                                ", Salário mensal: " + e.getSalary() +
                                ", Salário anual: " + (e.getSalary() * 12) +
                                ", Status: " + e.isStatus()
                )
        );
    }
}