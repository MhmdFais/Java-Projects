package StudentManagement;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentID {
    ArrayList<Integer> stuID = new ArrayList<Integer>();

    public StudentID(){
        getStuIDFromUser();
    }

    private void getStuIDFromUser(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the student's ID: ");
        int id = scanner.nextInt();
        //check if the input is an integer and if it is not already in the list
        if(!scanner.hasNextInt()){
            System.out.println("Invalid input, Please enter a number.");
            getStuIDFromUser();
        } else if(stuID.contains(id)){
            System.out.println("This ID is already in use, Please enter a different ID.");
            getStuIDFromUser();
        } else {
            stuID.add(id);
        }
    }

    public String toString(){
        return "ID: " + stuID.get(0);
    }
}
