package entities;

import java.util.ArrayList;

public class SalaryIncrease {
    private Integer Id;
    private String name;
    private Double salary;

    public SalaryIncrease(Integer id, String name, Double salary) {
        Id = id;
        this.name = name;
        this.salary = salary;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public static SalaryIncrease FindById(ArrayList<SalaryIncrease> list, int id){

        for(SalaryIncrease emp : list){
            if(emp.getId() == id){
                return emp;
            }
        }
        return null;
    }

    public static double IncreaseEmployeeSalary(double salary, double porcentege ){
        return salary + salary * (porcentege / 100);
    }
    @Override
    public String toString() {
        return "ID: " + Id + ", Nome: " + name + ", Salário: " + String.format("%.2f", salary);
    }

}
