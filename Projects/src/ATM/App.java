package ATM;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        getAccountDetails();
    }

    public static void getAccountDetails() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter account number: ");
        int accountNumber = in.nextInt();
        System.out.println("Enter account holder name: ");
        String accountHolderName = in.next();
        System.out.println("Enter account type: ");
        String accountType = in.next();
        System.out.println("Enter balance: ");
        double balance = in.nextDouble();
        System.out.println("Enter pin: ");
        String pin = in.next();
    }
}
