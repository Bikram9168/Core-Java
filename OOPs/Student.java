package OOPs;

public class Student {
    String sName; // Information/Data/Characterstics --> Instance Variable
    int rollNo;
    int age;
    String address;
    double marks;

    Student() {
        // Default Constructor
        this.sName = "Unknown";
        this.rollNo = 0;
        this.age = 0;
        this.address = "Unknown";
        this.marks = 0;
    }

    Student(String sName) {
        this.sName = sName;
    }

    Student(String sName, int rollNo) {
        this.sName = sName;
        this.rollNo = rollNo;
    }

    Student(String sName, int rollNo, int age) {
        this.sName = sName;
        this.rollNo = rollNo;
        this.age = age;
    }

    Student(String sName, int rollNo, int age, String address) {
        this.sName = sName;
        this.rollNo = rollNo;
        this.age = age;
        this.address = address;
    }

    // This is a parametrized constructor
    Student(String sName, int rollNo, int age, String address, double marks) {
        this.sName = sName;
        this.rollNo = rollNo;
        this.age = age;
        this.address = address;
        this.marks = marks;
    }

    void studentDetails() // Instance Method
    {
        System.out.println(sName + " , " + rollNo + " , " + age + " , " + address + " , " + marks);
    }

    void markAttendance() {
        System.out.println("Attendance marked by " + sName);
    }
}
