package ATM;

public class CurrentAccount extends AccountDetails{
    private double overdraftLimit;

    public CurrentAccount(String accountNumber, String accountHolderName, String accountType, double balance, String pin, double overdraftLimit) {
        super(accountNumber, accountHolderName, accountType, balance, pin);
        this.overdraftLimit = overdraftLimit;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }
}
