package ATM;

public class SavingAccount extends AccountDetails{
    private double interestRate;

    public SavingAccount(String accountNumber, String accountHolderName, String accountType, double balance, String pin, double interestRate) {
        super(accountNumber, accountHolderName, accountType, balance, pin);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
}
