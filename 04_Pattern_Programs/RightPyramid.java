public class RightPyramid {
    public static void main(String[] args) {
        int rows = 5; // Total number of rows

        // Outer loop for rows
        for (int i = 1; i <= rows; i++) {
            // Inner loop for columns
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            // Move to the next line after completing a row
            System.out.println();
        }
    }
}

