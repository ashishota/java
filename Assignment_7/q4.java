import java.util.Scanner;

public class q4 {
  public static void main(String[] args) throws insufficientFundException{
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the value of x: ");
    double x = sc.nextDouble();
    System.out.print("Enter the value of y: ");
    double y = sc.nextDouble();
    double result;
    try {
      if (x > y ) {
        throw new insufficientFundException("Number invalid");
      }
      result = x / (x - y);
      System.out.println("Result: " + result);
    } catch (insufficientFundException e) {
      System.out.println("Exception caught: " + e.getMessage());
    }
  }
}

