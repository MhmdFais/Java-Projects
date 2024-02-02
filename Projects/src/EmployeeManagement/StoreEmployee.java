package EmployeeManagement;

import java.util.ArrayList;

public class StoreEmployee {
    private ArrayList<Employee> employees;

    public StoreEmployee(){
        employees = new ArrayList<>();
    }

    public void addEmployee(Employee emp){
        employees.add(emp);
    }

    public void printAllEmployees(){
        for(Employee emp: employees){
            System.out.println(emp);
        }
    }
}
