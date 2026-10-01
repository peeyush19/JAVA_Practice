import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.print("Enter a number to calculate its factorial: ");
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        long fact = 1;
        
        // Calculate factorial using a loop
        for (int i = 1; i <= number; i++) {
            fact *= i;
        }
        
        System.out.println("Factorial of " + number + " is: " + fact);
        sc.close();
    }
}
