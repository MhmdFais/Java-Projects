package EmployeeManagement;

public class MyApp {
    public static void main(String[] args) {
        Name name = new Name();
        name.getNameFromUser();
        DateOfBirth DOB = new DateOfBirth();
        DOB.getDateOfBirthFromUser();
        Employee emp = new Employee();
        TemporaryEmployee tempEmp = new TemporaryEmployee(name, 123456789, DOB);
        System.out.println(tempEmp);
    }
}
