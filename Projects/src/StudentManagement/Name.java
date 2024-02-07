package StudentManagement;

public class Name {
    private String firstName;
    private String lastName;

    public Name() {
        this.firstName = getFirstNameFromUser();
        this.lastName = getLastNameFromUser();
    }

    private String getFirstNameFromUser(){
        System.out.print("Enter the student's first name: ");
        return System.console().readLine();
    }

    private String getLastNameFromUser(){
        System.out.print("Enter the student's last name: ");
        return System.console().readLine();
    }

    public String toString(){
        return firstName + " " + lastName;
    }
}
