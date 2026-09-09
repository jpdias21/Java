package dataBase.entity;

public class Employees {

    protected String name;
    protected Double salary;
    protected boolean ativo;


    public Employees(){};

    public Employees(String name, Double salary, boolean ativo) {
        this.name = name;
        this.salary = salary;
        this.ativo = ativo;
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

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    @Override
    public String toString() {
        return "Employees{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", ativo=" + ativo +
                '}';
    }
}
