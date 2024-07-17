import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number : ");
        int n1 = scanner.nextInt();

        int n2;
        while(true){
            try{
                System.out.println("Enter the scond number : ");
                    n2=scanner.nextInt();
                    if(n2==0){
                          throw new ArithmeticException("Error: Division by Zero is not allowed");              
                    }
                    double result=(double) n1/n2;
                    System.out.println("Result of n1 / n2: " + result);
                    break; 
            }catch(ArithmeticException e){
                System.out.println(e.getMessage());
                // scanner.nextLine();
            }
        }
        scanner.close();
    }
}

