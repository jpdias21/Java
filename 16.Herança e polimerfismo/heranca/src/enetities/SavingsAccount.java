package entities;

public class SavingsAccount extends Account{

    private double interstRate;

    public SavingsAccount(Double balance, String holder, Integer number, double interstRate) {
        super(balance, holder, number);
        this.interstRate = interstRate;
    }

    public double getInterstRate() {
        return interstRate;
    }

    public void setInterstRate(double interstRate) {
        this.interstRate = interstRate;
    }

    public void updateBalance(){

        balance += balance * interstRate;
    }

}
