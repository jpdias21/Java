package entities;

public class Salary {
    public String name;
    public double grossSalary;
    public double tax = 1000.00;
    public double NetSalary(){
        return  grossSalary - tax;
    }

    public void increaseSalary(double increaseSalaryEmployee){
        double calculation = (grossSalary / 100 ) * increaseSalaryEmployee;
       this.grossSalary += calculation;
    }

    public String toEmployee(){
        return "Employee: " + name + ", your salary $" + String.format("%.2f", NetSalary()) + ", tax: " + tax;
    }

    public String toIncreaseSalary(){
        return  "Update data: " + name + ", $" + String.format("%.2f" , grossSalary);
    }

}
