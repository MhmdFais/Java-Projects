package EmployeeManagement;

import java.util.Scanner;

public class PermenantEmployee extends Employee{
    private int salary;
    private int annualBonus;

    //public PermenantEmployee(){}

    public PermenantEmployee(Name name, DateOfBirth DOB, int NICNumber){
        super(name, DOB, NICNumber);
        this.salary = 0;
        this.annualBonus = 0;
    }

    public void getSalaryFromUser(){
        salary = getSalaryFromUserIn();
        annualBonus = getAnnualBonusFromUser();
    }

    private int getSalaryFromUserIn(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the salary: ");
        int inp = in.nextInt();
        if ( inp >= 10000 ){
            return inp;
        }
        else{
            System.out.println("Minimum salary is 10,000/=");
            getSalaryFromUserIn();
        }
        return 0;
    }

    private int getAnnualBonusFromUser(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the annual bonus: ");
        int inp = in.nextInt();
        if ( inp <= 10000 ){
            return inp;
        }
        else{
            System.out.println("Annual bonus does not exceeds 10,000/=");
            getAnnualBonusFromUser();
        }
        return 0;
    }

    public int getSalary(){
        return salary;
    }

    public int getAnnualBonus(){
        return annualBonus;
    }

    public String toString(){
        return super.toString() + "\nSalary: " + salary + "\nAnnual Bonus: " + annualBonus;
    }
}
