import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Area newArea = new Area();

        Scanner s = new Scanner(System.in);
        System.out.print("Choose option: ");
        System.out.print("1. Circle: ");
        System.out.print("2. Rectangle: ");

        int option = s.nextInt();

        switch (option){
            case 1:
                System.out.println("Enter circle radius: ");
                double radius = s.nextDouble();
                System.out.println(newArea.area(radius));
            break;

            case 2:
                System.out.print("Enter rectangle length: ");
                double length = s.nextDouble();
                System.out.print("Enter rectangle width: ");
                double width = s.nextDouble();
                System.out.println(newArea.area(length, width));
        }
    }
}