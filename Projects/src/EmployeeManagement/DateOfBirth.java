package EmployeeManagement;

import java.util.Scanner;

public class DateOfBirth {
    private int day;
    private int month;
    private int year;

    public void getDateOfBirthFromUser(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter day of birth: ");
        day = in.nextInt();
        System.out.print("Enter month of birth: ");
        month = in.nextInt();
        System.out.print("Enter year of birth: ");
        year = in.nextInt();
    }

    public String toString(){
        return day + "/" + month + "/" + year;
    }
}
