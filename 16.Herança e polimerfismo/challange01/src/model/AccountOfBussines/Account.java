package model.AccountOfBussines;

public class Account {
    protected Integer number;
    protected String holder;
    protected Double balance;

    protected Integer idAccountBD;

    public Integer getIdAccountBD() {
        return idAccountBD;
    }

    public void setIdAccountBD(Integer idAccountBD) {
        this.idAccountBD = idAccountBD;
    }

    public Account(){

    }
    public Account(Double balance, String holder, Integer number) {
        this.balance = balance;
        this.holder = holder;
        this.number = number;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
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

}
