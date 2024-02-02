package EmployeeManagement;

import java.util.Scanner;

public class TemporaryEmployee extends Employee{
    private int contractPeriod;
    private int hourlyRate;


    public TemporaryEmployee(Name name, DateOfBirth DOB){
        super(name, DOB);
        this.contractPeriod = 0;
        this.hourlyRate = 0;
    }

    public void getContractPeriodFromUser(){
        contractPeriod = getContractPeriodFromUserIn();
        hourlyRate = getHourlyRatePeriodFromUser();
    }

    private int getContractPeriodFromUserIn(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the contract period (months): ");
        int inp = in.nextInt();
        if ( inp <=12 && inp > 0 ){
            return inp;
        }
        else{
            System.out.println("Temporary contract period does not exceeds 12 months");
            getContractPeriodFromUserIn();
        }
        return 0;
    }

    private int getHourlyRatePeriodFromUser(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the hourly rate for a day: ");
        int inp = in.nextInt();
        if ( inp >= 10000 ){
            System.out.println("Hourly rates does not exceeds 10,000/=");
            getHourlyRatePeriodFromUser();
        }
        return inp;
    }

    public int getHourlyRate(){
        return hourlyRate;
    }

    public int getContractPeriod(){
        return contractPeriod;
    }

    public String toString(){
        return super.toString() + "\nContract Period: " + contractPeriod + "\nHourly Rate: " + hourlyRate;
    }

}
