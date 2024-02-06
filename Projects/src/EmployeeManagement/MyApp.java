package EmployeeManagement;

import java.util.Scanner;

public class MyApp {
    public static void main(String[] args) {
//        Name name = new Name();
//        name.getNameFromUser();
//        DateOfBirth DOB = new DateOfBirth();
//        DOB.getDateOfBirthFromUser();
//        TemporaryEmployee tempEmp = new TemporaryEmployee(name,  DOB);
//        tempEmp.getContractPeriodFromUser();
//        System.out.println(tempEmp);
        printMenu();

    }

    public static void printMenu(){
        Scanner in = new Scanner(System.in);
        int choice;
        do{
            System.out.println("=================================");
            System.out.println("Employee Management System");
            System.out.println("=================================");
            System.out.println("1. Add a permanent employee");
            System.out.println("2. Add a temporary employee");
            System.out.println("3. Print all employees");
            System.out.println("4. Exit");
            System.out.println();
            System.out.print("Enter your choice: ");
            choice = in.nextInt();
            switch(choice){
                case 1:
                    addPermanentEmployee();
                    break;
                case 2:
                    addTemporaryEmployee();
                    break;
                case 3:
                    printAllEmployees();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 4);
    }

    public static void addPermanentEmployee(){
        Name name = new Name();
        name.getNameFromUser();
        DateOfBirth DOB = new DateOfBirth();
        DOB.getDateOfBirthFromUser();
        int nic = getNic();
        PermenantEmployee perEmp = new PermenantEmployee(name, DOB, nic);
        perEmp.getSalaryFromUser();
//        System.out.println();
//        System.out.println(perEmp);
        StoreEmployee store = new StoreEmployee();
        store.addEmployee(perEmp);
    }

    public static void addTemporaryEmployee(){
        Name name = new Name();
        name.getNameFromUser();
        DateOfBirth DOB = new DateOfBirth();
        DOB.getDateOfBirthFromUser();
        int nic = getNic();
        TemporaryEmployee tempEmp = new TemporaryEmployee(name, DOB, nic);
        tempEmp.getContractPeriodFromUser();
//        System.out.println();
//        System.out.println(tempEmp);
        StoreEmployee store = new StoreEmployee();
        store.addEmployee(tempEmp);
    }

    public static void printAllEmployees(){
        StoreEmployee store = new StoreEmployee();
        System.out.println("All Employees");
        store.printAllEmployees();
    }

    public static int getNic(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter NIC number: ");
        int nic = in.nextInt();
        if(String.valueOf(nic).length() >= 8){
            return nic;
        }
        else{
            System.out.println("NIC number is short(should be at least 8 characters long)");
        }
        return getNic();
    }

}
