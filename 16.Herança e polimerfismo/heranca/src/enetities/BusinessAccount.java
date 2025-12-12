package entities;

public class BusinessAccount extends Account{
    private double loanLimit;


    public BusinessAccount(Double balance, String holder, Integer number, double loanLimit) {
        super(balance, holder, number);
        this.loanLimit = loanLimit;
    }


    public double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(double loanLimit) {
        this.loanLimit = loanLimit;
    }

    public void loan(double amount){
        if(amount  + 10 <= loanLimit){
            deposit(amount);
            widrew(10);
        }
        System.out.println("You no have limit for this lona transition, your limit is " + loanLimit);

    }
}
