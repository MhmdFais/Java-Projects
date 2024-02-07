package StudentManagement;

public class Student {
    private final Name name;
    private final DateOfBirth dateOfBirth;

    private final StudentID stuID;

    public Student(Name name, DateOfBirth dateOfBirth, StudentID stuID) {
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

    public StudentID getStuID(){
        return stuID;
    }
}
