package entities;

public class Account {
    protected Integer number;
    protected String holder;
    protected Double balance;

    public Account(Double balance, String holder, Integer number) {
        this.balance = balance;
        this.holder = holder;
        this.number = number;
    }


    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Double getBalance() {
        return balance;
    }

    public void widrew(double amount){
        if(amount > balance){
            System.out.println("amount is more than balance ");
        }
        balance -= amount;
    }

    public void deposit(double amount){
        balance += amount;
    }
}
