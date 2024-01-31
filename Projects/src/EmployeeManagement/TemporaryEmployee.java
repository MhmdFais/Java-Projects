package EmployeeManagement;

import java.util.Scanner;

public class TemporaryEmployee extends Employee{
    private int contractPeriod;
    private int hourlyRate;


    public TemporaryEmployee(Name name, int NICNumber, DateOfBirth DOB){
        super(name, NICNumber, DOB);
        this.contractPeriod = 0;
        this.hourlyRate = 0;
    }

    private void getContractPeriodFromUser(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter contract period: ");
        contractPeriod = in.nextInt();
        System.out.println("Enter hourly rate: ");
        hourlyRate = in.nextInt();
    }

    public String toString(){
        return super.toString() + "\nContract Period: " + contractPeriod + "\nHourly Rate: " + hourlyRate;
    }

}
