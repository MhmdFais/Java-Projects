package EmployeeManagement;

import java.util.Scanner;

public class Employee {
    private Name name;
    private String NICNumber;
    private DateOfBirth DOB;

    //public Employee(){}

    public Employee(Name name, DateOfBirth DOB, String NICNumber){
        this.name = name;
        this.NICNumber = NICNumber;
        this.DOB = DOB;
    }

//    public void getNICNumberFromUser(){
//        Scanner in = new Scanner(System.in);
//        System.out.print("Enter NIC number: ");
//        int nic = in.nextInt();
//        if(String.valueOf(nic).length() >= 8){
//            NICNumber = nic;
//        }
//        else{
//            System.out.println("NIC number is short(should be at least 8 characters long)");
//            getNICNumberFromUser();
//        }
//    }

    public String toString(){
        return "Name: " + name + "\nNIC Number: " + NICNumber + "\nDate of Birth: " + DOB;
    }
}
