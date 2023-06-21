import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Choose Option:");
        System.out.println("1. Create an Instructor: ");
        System.out.println("2. Create a Student: ");

        int option = s.nextInt();

        switch (option){
            case 1:
                Faculty f1 = new Faculty();
                f1.inputData();
                f1.display();
            break;

            case 2:
                Student s1 = new Student();
                s1.inputData();
                s1.display();
        }

    }
}