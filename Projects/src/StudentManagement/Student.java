package StudentManagement;

public class Student {
    private final Name name;
    private final DateOfBirth dateOfBirth;

    private final int stuID;

    public Student(Name name, DateOfBirth dateOfBirth, int stuID) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.stuID = stuID;
    }

    public Name getName() {
        return name;
    }

    public DateOfBirth getDateOfBirth() {
        return dateOfBirth;
    }

    public int getStuID(){
        return stuID;
    }

    public String toString() {
        return "Name: " + name + "\nDate of Birth: " + dateOfBirth + "\nStudent ID: " + stuID;
    }

}
