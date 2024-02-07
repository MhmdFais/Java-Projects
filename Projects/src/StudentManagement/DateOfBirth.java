package StudentManagement;

import java.util.Scanner;

public class DateOfBirth {
    private int day;
    private int month;
    private int year;

    public DateOfBirth() {
        this.day = getDayFromUser();
        this.month = getMonthFromUser();
        this.year = getYearFromUser();
    }

    private int getDayFromUser(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the student's birth date: ");
        int day = in.nextInt();
        if (day>0 && day<=31){
            return day;
        }
        else{
            wrongInputMessage();
        }
        return getDayFromUser();
    }

    private int getMonthFromUser(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the month of birth (1-12): ");
        int month = in.nextInt();
        if ( month > 0 && month < 13 ){
            return month;
        }
        else{
            wrongInputMessage();
        }
        return getMonthFromUser();
    }

    private int getYearFromUser(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the year of birth: ");
        int year = in.nextInt();
        if ( year < 0 ){
            wrongInputMessage();
            return getYearFromUser();
        }
        return year;
    }

    private void wrongInputMessage(){
        System.out.println("Input is wrong!");
    }

    public String toString(){
        return day + "/" + month + "/" + year;
    }
}
