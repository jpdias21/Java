import dataBase.entity.Employees;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        List<Employees> employeesList = new ArrayList<>();

        employeesList.add(new Employees("Joao", 2000.00, true));
        employeesList.add(new Employees("Maria", 15000.00, true));
        employeesList.add(new Employees("Carlos", 3200.00, false));
        employeesList.add(new Employees("Ana", 7800.00, true));
        employeesList.add(new Employees("Pedro", 2500.00, false));
        employeesList.add(new Employees("Fernanda", 12500.00, true));
        employeesList.add(new Employees("Lucas", 3800.00, true));
        employeesList.add(new Employees("Juliana", 12000.00, true));
        employeesList.add(new Employees("Rafael", 1800.00, false));
        employeesList.add(new Employees("Beatriz", 6500.00, true));
        employeesList.add(new Employees("Gustavo", 11000.00, true));
        employeesList.add(new Employees("Camila", 2900.00, false));
        employeesList.add(new Employees("Bruno", 5400.00, true));
        employeesList.add(new Employees("Larissa", 15000.00, true));
        employeesList.add(new Employees("Mateus", 2300.00, false));
        employeesList.add(new Employees("Amanda", 8700.00, true));
        employeesList.add(new Employees("Diego", 4200.00, false));
        employeesList.add(new Employees("Carolina", 13500.00, true));
        employeesList.add(new Employees("Felipe", 11000.00, true));
        employeesList.add(new Employees("Mariana", 6000.00, false));
        

        System.out.println("====================");
        employeesList.stream().filter(e -> e.getSalary() <= 5000.00).forEach(e -> e.setSalary(e.getSalary() * 1.10));

        System.out.println("-============");
        employeesList.forEach(e -> System.out.println("Funcionarios:" + e.getEmployee() + ", Salario:" + e.getSalary() + ", Status: " + e.isStatus()));
    }
}