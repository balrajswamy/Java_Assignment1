
import java.util.Scanner;

public class test_scanner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Type your Name:\t");

        String myName = scanner.nextLine();
        
        System.out.print("Enter your age:\t");
        int age = scanner.nextInt();
        System.out.println("Student Info");
        System.out.println("Student Name:\t "+ myName);
        System.out.println("Age:\t "+age);


    }
    
}
