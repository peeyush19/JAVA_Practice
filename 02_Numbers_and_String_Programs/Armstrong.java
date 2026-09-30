import java.util.Scanner;

public class Armstrong {
  public static void main (String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Please Enter a number to verify armstrong or not.");
    int n = sc.nextInt();
    int temp = n, sum = 0;

    while(temp > 0){
      int d = temp % 10;
      sum+= d * d * d;
      temp/= 10;
    }
    
    System.out.println(sum == n? "Armstrong number" : "Not a Armstrong number");
    sc.close();
  }
}
