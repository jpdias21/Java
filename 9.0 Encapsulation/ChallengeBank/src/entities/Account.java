package entities;

public class Account {
    private String name;
    private double balance;
    private String cpf;
    public Account(){
        balance = 0.0;
    }

    public Account(String name, String cpf){
        this();
        this.name = name;
        this.cpf = cpf;
    }

    public String getName(){
        return name;
    }
    public String getCpf(){
        return cpf;
    }
    public double getBalance(){
        return balance;
    }
///
///
    public void setName(String newName){
        name = newName;
    }
    public void setCpf(String newCpf){
        cpf = newCpf;
    }

    public void Deposit(double deposit){
        if(deposit > 0){
            balance += deposit;
        }else{
            System.out.println("o valor precisa ser positivo");
        }
    }

    public void Remove(double remove){
        if(remove > balance || balance == 0.0){
            System.out.println("saldo insuficente");
        }else{
            balance -= remove;
        }
    }
}
