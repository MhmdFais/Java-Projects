package EmployeeManagement;

import java.util.Scanner;

public class DateOfBirth {
    private int day;
    private int month;
    private int year;

    public void getDateOfBirthFromUser(){
        day = getDayFromUser();
        month = getMonthFromUser();
        year = getYearFromUser();
    }

    private int getDayFromUser(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the date of your birth: ");
        int inp = in.nextInt();
        if ( inp >0 && inp < 32 ){
            return inp;
        }
        else {
            wrongInputMessage();
        }
        return getDayFromUser();
    }

    private int getMonthFromUser(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the month of your birth(1-12): ");
        int imp = in.nextInt();
        if ( imp > 0 && imp < 13 ){
            return  imp;
        }
        else{
            wrongInputMessage();
        }
        return getMonthFromUser();
    }

    private int getYearFromUser(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the year of your birth: ");
        int inp = in.nextInt();
        if ( inp < 0 ){
            wrongInputMessage();
            return getYearFromUser();
        }
        return inp;
    }

    private void wrongInputMessage(){
        System.out.println("Wrong input!");
    }

    public String toString(){
        return day + "/" + month + "/" + year;
    }
}
