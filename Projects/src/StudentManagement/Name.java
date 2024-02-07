package StudentManagement;

import java.util.Scanner;

public class Name {
    private String firstName;
    private String lastName;

    public Name() {
        this.firstName = getFirstNameFromUser();
        this.lastName = getLastNameFromUser();
    }

    private String getFirstNameFromUser(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the student's first name: ");
        return scanner.nextLine();
    }

    private String getLastNameFromUser(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the student's last name: ");
        return scanner.nextLine();
    }

    public String toString(){
        return firstName + " " + lastName;
    }
}
