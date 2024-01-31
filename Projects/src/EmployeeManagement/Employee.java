package EmployeeManagement;

import java.util.Scanner;

public class Employee {
    private Name name;
    private int NICNumber;
    private DateOfBirth DOB;

    public Employee(){}

    public Employee(Name name, int NICNumber, DateOfBirth DOB){
        this.name = name;
        this.NICNumber = NICNumber;
        this.DOB = DOB;
    }

    public void getNICNumberFromUser(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter NIC number: ");
        NICNumber = in.nextInt();
    }

    public String toString(){
        return "Name: " + name + "\nNIC Number: " + NICNumber + "\nDate of Birth: " + DOB;
    }
}
