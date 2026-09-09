package dataBase.entity;

public class Employees {

    protected String employee;
    protected Double salary;
    protected boolean status;

    public Employees() {
    }

    public Employees(String employee, Double salary, boolean status) {
        this.employee = employee;
        this.salary = salary;
        this.status = status;
    }

    public String getEmployee() {
        return employee;
    }

    public void setEmployee(String employee) {
        this.employee = employee;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
