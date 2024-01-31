package EmployeeManagement;

import java.util.Scanner;

public class Name {
    private String firstName;
    private String lastName;
    private String middleName;

    public void getNameFromUser(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first name: ");
        firstName = in.nextLine();
        System.out.print("Enter middle name: ");
        middleName = in.nextLine();
        System.out.print("Enter last name: ");
        lastName = in.nextLine();
    }

    public String toString(){
        return firstName + " " + middleName + " " + lastName;
    }
}
