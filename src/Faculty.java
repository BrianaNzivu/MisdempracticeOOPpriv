import java.util.Scanner;

public class Faculty {
    private String fName;
    private String courseCde;
    private String grade;

    public void inputData() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Faculty name: ");
        fName = s.next();
        System.out.println("Enter Course code: ");
        courseCde = s.next();
        System.out.println("Enter Grade: ");
        grade = s.next();
    }

    public void display() {
        System.out.println("Student name: " + fName + "Course code: " + courseCde + "Grade: " + grade);
    }
}
