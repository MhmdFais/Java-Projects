package ATM;

import java.util.Scanner;

public class App {
    private String accountNumber;
    private String pin;
    private double balance;
    public void start(){
        getUserAccountDetails();
        getActionWantToPerform();
    }

    private void getUserAccountDetails(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your account number: ");
        this.accountNumber = in.nextLine();
        System.out.println("Enter your PIN: ");
        this.pin = in.nextLine();
        System.out.println("Enter your initial balance: ");
        this.balance = in.nextDouble();
        saveAccountDetails(accountNumber, pin, balance);
        in.close();
    }

    private void getActionWantToPerform(){
        Scanner in = new Scanner(System.in);
        AccountDetails account = new AccountDetails(this.accountNumber, this.pin, this.balance);
        System.out.println("Enter the action you want to perform: ");
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Check balance");
        System.out.println("4. Change PIN");
        System.out.println("5. Exit");
        int action = in.nextInt();
        switch (action) {
            case 1:
                System.out.println("Enter the amount you want to deposit: ");
                double depositAmount = in.nextDouble();
                account.deposit(depositAmount);
                break;
            case 2:
                System.out.println("Enter the amount you want to withdraw: ");
                double withdrawAmount = in.nextDouble();
                account.withdraw(withdrawAmount);
                break;
            case 3:
                account.checkBalance();
                break;
            case 4:
                System.out.println("Enter your old PIN: ");
                String oldPin = in.next();
                System.out.println("Enter your new PIN: ");
                String newPin = in.next();
                account.changePin(oldPin, newPin);
                break;
            case 5:
                System.out.println("Exiting...");
                break;
            default:
                System.out.println("Invalid action.");
        }
        in.close();
    }

    private void saveAccountDetails(String accountNumber, String pin, double balance){
        AccountDetails account = new AccountDetails(accountNumber, pin, balance);
        account.addAccountDetails(account);
    }
}