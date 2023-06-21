import java.util.Scanner;

public class Student {
    private String sName;
    private String courseCode;
    private String grade;

    public void inputData(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Student name: ");
        sName = s.next();
        System.out.println("Enter Course code: ");
        courseCode = s.next();
    }

    public void display (){
        System.out.println("Student name: " + sName + "Course code: " + courseCode);
    }
}
