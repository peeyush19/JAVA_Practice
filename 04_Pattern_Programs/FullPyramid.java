public class FullPyramid {
    public static void main(String[] args) {
        int rows = 5;

        for (int i = 1; i <= rows; i++) {
            // Inner loop 1: Prints decreasing spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            // Inner loop 2: Prints stars
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

