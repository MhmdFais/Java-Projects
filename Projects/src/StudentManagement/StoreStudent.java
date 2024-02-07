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

    public void removeStudent(int index){
        students.remove(index);
    }

    public void updateStudent(int index, Student student){
        students.set(index, student);
    }



    public boolean isStudent(int index){
        return students.contains(students.get(index));
    }

    public Student getStudent(int index){
        return students.get(index);
    }
}
