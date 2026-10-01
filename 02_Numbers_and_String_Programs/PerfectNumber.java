// A perfect number is a positive integer that is equal to the sum of its proper positive divisors, excluding the number itself. For example, 6 is a perfect number because its divisors are 1, 2, and 3, and 1 + 2 + 3 = 6.

import java.util.Scanner;

public class PerfectNumber {

    // Method to check if a number is perfect
    public static boolean isPerfect(long num) {
        if (num <= 1) {
            return false;
        }

        long sum = 0;
        
        // Loop up to half of the number, as a divisor cannot exceed num/2
        for (long i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i; // Add divisor to sum
            }
        }

        // Return true if the sum of divisors equals the original number
        return sum == num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        if (sc.hasNextLong()) {
            long number = sc.nextLong();

            if (isPerfect(number)) {
                System.out.println(number + " is a perfect number.");
            } else {
                System.out.println(number + " is NOT a perfect number.");
            }
        } else {
            System.out.println("Please enter a valid integer.");
        }

        sc.close();
    }
}
