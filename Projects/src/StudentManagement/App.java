package StudentManagement;

import java.util.Scanner;

public class App {
    static StoreStudent storeStudent = new StoreStudent();
    static StudentID stuID = new StudentID();
    public static void main(String[] args) {
        menu();
    }

    public static void menu(){
        Scanner in = new Scanner(System.in);
        int choice;
        do {
            System.out.println("========================================");
            System.out.println("Welcome to the Student Management System");
            System.out.println("1. Add a student");
            System.out.println("2. Remove a student");
            System.out.println("3. Update a student");
            System.out.println("4. Print a certain student's information");
            System.out.println("5. Print all students");
            System.out.println("6. Exit");
            System.out.println("========================================");
            System.out.print("Enter your choice: ");
            choice = in.nextInt();
            System.out.println();
            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    removeStudent();
                    break;
                case 3:
                    updateStudent();
                    break;
                case 4:
                    printStudent();
                    break;
                case 5:
                    printAllStudents();
                    break;
                case 6:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 6);
    }

    public static void addStudent(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the student's information");
        Name name = new Name();
        DateOfBirth dateOfBirth = new DateOfBirth();
        int ID = stuID.getStuIDFromUser();
        Student student = new Student(name, dateOfBirth, ID);
        storeStudent.addStudent(student);
        System.out.println("Adding the student...");
        System.out.println("Student added successfully");
        System.out.println();
        //System.out.println(student);
    }

    public static void removeStudent(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the index of the student you want to remove: ");
        int index = in.nextInt();
        storeStudent.removeStudent(index);
        System.out.println();
    }

    public static void updateStudent(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the id of the student you want to update: ");
        int index = in.nextInt();
        if ( !storeStudent.isStudent(index) ){
            System.out.println("No student with the given index");
            updateStudent();
        }
        else {
            System.out.println("Enter the student's updated information");
            Name name = new Name();
            DateOfBirth dateOfBirth = new DateOfBirth();
            int ID = stuID.getStuIDFromUser();
            Student student = new Student(name, dateOfBirth, ID);
            storeStudent.updateStudent(index, student);
            System.out.println("Updating the student...");
            System.out.println("Student updated successfully");
            System.out.println();
        }
    }

    public static void printStudent(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the index of the student you want to print: ");
        int index = in.nextInt();
        if ( !storeStudent.isStudent(index) ){
            System.out.println("No student with the given index");
            System.out.println("Do you want to try again? (y/n)");
            char choice = in.next().charAt(0);
            if (choice == 'y'){
                printStudent();
            }
            else {
                System.out.println();
            }
        }
        else {
            System.out.println("Printing the student...");
            System.out.println("---------------------------------");
            System.out.println(storeStudent.getStudent(index));
            System.out.println("---------------------------------");
            System.out.println();
        }
    }

    public static void printAllStudents(){
        System.out.println("Printing all the students...");
        System.out.println("---------------------------------");
        storeStudent.printStudents();
        System.out.println();
    }
}
