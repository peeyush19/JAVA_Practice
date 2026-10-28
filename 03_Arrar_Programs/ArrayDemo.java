import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        // 1. Declare and initialize an integer array
        int[] numbers = {10, 50, 20, 40, 30};

        // 2. Access elements using an index (starts at 0)
        System.out.println("First element (index 0): " + numbers[0]);
        System.out.println("Third element (index 2): " + numbers[2]);

        // 3. Find the length of the array
        int totalElements = numbers.length;
        System.out.println("Total elements in the array: " + totalElements);

        // 4. Calculate the sum using an enhanced for-each loop
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Sum of all elements: " + sum);

        // 5. Modify an element
        numbers[0] = 99; // Changes 10 to 99
        System.out.println("Modified first element: " + numbers[0]);

        // 6. Easily print the whole array using the Arrays utility library
        System.out.println("Array contents: " + Arrays.toString(numbers));
    }
}

