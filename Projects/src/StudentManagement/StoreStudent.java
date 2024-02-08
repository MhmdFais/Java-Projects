package StudentManagement;

import java.util.ArrayList;

public class StoreStudent {
    ArrayList<Student> students = new ArrayList<Student>();

    public void addStudent(Student student){
        students.add(student);
    }

    public void printStudents(){
        for(Student student : students){
            System.out.println(student);
            System.out.println("---------------------------------");
        }
    }

    public void removeStudent(int studentID){
        // Iterate through the list of students
        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            // Check if the student's ID matches the provided studentID
            if (student.getStuID() == studentID) {
                // Remove the student from the list
                students.remove(i);
                System.out.println("Removing the student with ID " + studentID);
                System.out.println("Student removed successfully");
                return; // Exit the method after removing the student
            }
        }
        // If no student with the provided ID is found
        System.out.println("No student found with ID " + studentID);
    }

    public void updateStudent(int studentID, Student updatedStudent){
        // Iterate through the list of students
        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            // Check if the student's ID matches the provided studentID
            if (student.getStuID() == studentID) {
                // Update the student information
                students.set(i, updatedStudent);
                System.out.println("Updating the student with ID " + studentID);
                System.out.println("Student updated successfully");
                return; // Exit the method after updating the student
            }
        }
        // If no student with the provided ID is found
        System.out.println("No student found with ID " + studentID);
    }

    public boolean isStudent(int studentID){
        for (Student student : students) {
            if (student.getStuID() == studentID) {
                return true;
            }
        }
        return false;
    }

    public Student getStudent(int studentID){
        for (Student student : students) {
            if (student.getStuID() == studentID) {
                return student;
            }
        }
        return null;
    }
}
