package ATM;

import java.util.ArrayList;

class AccountDetails {
    private String pin;
    private double balance;
    private ArrayList<AccountDetails> accountDetails = new ArrayList<AccountDetails>();

    public AccountDetails(String accountNumber, String pin, double balance) {
        this.pin = pin;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.printf("Successfully deposited %.2f\n", amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public boolean withdraw(double amount) {
        if (0 < amount && amount <= this.balance) {
            this.balance -= amount;
            System.out.printf("Successfully withdrawn %.2f\n", amount);
            return true;
        } else {
            System.out.println("Insufficient funds or invalid withdrawal amount.");
            return false;
        }
    }

    public void checkBalance() {
        System.out.printf("Your current balance is %.2f\n", this.balance);
    }

    public boolean changePin(String oldPin, String newPin) {
        if (oldPin.equals(this.pin)) {
            this.pin = newPin;
            System.out.println("PIN successfully changed.");
            return true;
        } else {
            System.out.println("Incorrect old PIN.");
            return false;
        }
    }

    public void addAccountDetails(AccountDetails account) {
        accountDetails.add(account);
    }
}