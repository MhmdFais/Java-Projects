package StudentManagement;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentID {
    ArrayList<Integer> stuID = new ArrayList<Integer>();

    private int sid;


    public int getStuIDFromUser(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the student's ID: ");
        int id = scanner.nextInt();
        if(stuID.contains(id)){
            System.out.println("This ID is already taken. Please enter another ID.");
            return  getStuIDFromUser();
        } else {
            if (id < 0 || id == 0) {
                System.out.println("Invalid ID. Please enter a positive number.");
                return getStuIDFromUser();
            }
            else{
                sid = id;
                stuID.add(sid);
                return sid;
            }
        }
    }

//    public void printIDs(){
//        for(int id : stuID){
//            System.out.println(id);
//        }
//    }

    public String toString(){
        return "Student ID: " + sid ;

    }

}

