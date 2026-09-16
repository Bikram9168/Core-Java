package OOPs;

public class Main 
{
    public static void main(String[] args) 
    {
        Student s1 = new Student("Bikram", 15, 22, "Bankura", 92);
        Student s2 = new Student("Anubhav", 11, 20, "Durgapur", 90.9);
        
        s1.markAttendance();
        s1.studentDetails();

        s2.markAttendance();
        s2.studentDetails();
    }
}
