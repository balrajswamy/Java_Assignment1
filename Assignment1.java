import java.util.Scanner;

public class Assignment1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Enter your Name:\t");
        String myName = scanner.nextLine();
        System.out.println("Enter your Age:\t");
        int age = scanner.nextInt();
        System.out.println("Enter your Salary:\t");

        double salary = scanner.nextDouble();

        double bonus = salary+(salary*10/100);
        System.out.println("\n____Employee Details____\n");
        System.out.println("Name:\t"+myName);
        System.out.println("Age:\t"+age);
        System.out.println("Salary:\t"+salary);
        System.out.println("Salary with Bonus:\t"+bonus);

        // Closing the Scanner
        scanner.close();      

        
    }
}
