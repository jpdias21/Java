package entities;

public class Transactions {
    private int numberAccount;
    private String name;
    public double initialDeposit;
    private double taxSacar;
    private double balance;

    public Transactions(){
        taxSacar = 5.00;
        initialDeposit = 0.00;
    }
    public Transactions( int numberAccount, String name, double balance) {                    this();
        this.numberAccount = numberAccount;
        this.name = name;
        this.balance = balance;
    }

    public double getInitialDeposit() {
        return initialDeposit;
    }

    public String getName() {
        return name;
    }

    public int getNumberAccount() {
        return numberAccount;
    }

    public void setName(String newName){
        if(newName.isEmpty()){
            System.out.println("nao tem nenhum dado");
            return;
        }
        this.name = newName;
    }

    public void setNumberAccount(int newNumberAccount){
        this.numberAccount = newNumberAccount;
    }

    public void setInitialDeposit(double newInitialDeposit){
        if(newInitialDeposit == 0){
            return;
        }
        this.initialDeposit = newInitialDeposit;
        setBalance(this.initialDeposit);
    }

    public void setBalance(double newDeposit){
        if(newDeposit <= 0){
            System.out.println("o numero que voce digitou nao e valido");
            return;
        }
        this.balance += newDeposit;
    }

    public void setwithdraw(double newWithdraw){
        if(this.balance <=5 || newWithdraw <= 5){
            System.out.println("Voce precisa ter o saldo maior que 5 reais porque a texa de saque e " + taxSacar);
            return;
        }
     double calculation = (this.balance - newWithdraw) - taxSacar;
        this.balance = calculation;
    }
    public String getAccountData(){
        return "Account " + numberAccount + ", holder: " + name + ", Balance: $" + String.format("%.2f", balance);
    }

    public String getUptadeAccount(){
        return "Account " + numberAccount + ", Holder: " + name + ", Balance: " + String.format("%.2f", balance);
    }



}
