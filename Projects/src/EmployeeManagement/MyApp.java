package EmployeeManagement;

import java.util.Scanner;

public class MyApp {
    private static final StoreEmployee store = new StoreEmployee();
    public static void main(String[] args) {
        printMenu();

    }

    public static void printMenu(){
        Scanner in = new Scanner(System.in);
        int choice;
        do{
            System.out.println();
            System.out.println("=================================");
            System.out.println("Employee Management System");
            System.out.println("=================================");
            System.out.println("1. Add a permanent employee");
            System.out.println("2. Add a temporary employee");
            System.out.println("3. Print all employees");
            System.out.println("4. Delete an employee");
            System.out.println("5. Exit");
            System.out.println("=================================");
            System.out.println();
            System.out.print("Enter your choice: ");
            choice = in.nextInt();
            System.out.println();
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
                    deleteEmployee();
                    break;
                case 5:
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
        String nic = getNic();
        PermenantEmployee perEmp = new PermenantEmployee(name, DOB, nic);
        perEmp.getSalaryFromUser();
        store.addEmployee(perEmp);
    }

    public static void addTemporaryEmployee(){
        Name name = new Name();
        name.getNameFromUser();
        DateOfBirth DOB = new DateOfBirth();
        DOB.getDateOfBirthFromUser();
        String nic = getNic();
        TemporaryEmployee tempEmp = new TemporaryEmployee(name, DOB, nic);
        tempEmp.getContractPeriodFromUser();
        store.addEmployee(tempEmp);
    }

    public static void printAllEmployees(){
        System.out.println("All Employees");
        store.printAllEmployees();
    }

    public static void deleteEmployee(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the NIC number of the employee to delete: ");
        int nic = in.nextInt();
        store.deleteEmployee(nic);
    }

    public static String getNic(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter NIC number: ");
        String nic = in.nextLine();
        if(nic.length() >= 8){
            return nic;
        }
        else{
            System.out.println("NIC number is short(should be at least 8 characters long)");
        }
        return getNic();
    }
}
