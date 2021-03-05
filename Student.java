import java.util.LinkedList;

public class Student {
    LinkedList<Assignment> assignments;
    int Tardy;
    int Absent;
    String firstName;
    String lastName;
    String userName;
    long phoneNumber;

    public Student(String FirstName, String LastName, String UserName, long PhoneNumber){
        this.firstName=FirstName;
        this.lastName=LastName;
        this.userName=UserName;
        this.phoneNumber=PhoneNumber;
        assignments=new LinkedList<>();
        this.Tardy=0;
        this.Absent=0;

    }









}
