import java.util.Scanner;

public class q7 {
    public static void main(String args[])
    {
    Scanner in= new Scanner(System.in);
    int x,l,f=1,i;
    System.out.println("Enter the value of x =");
    x=in.nextInt();
    System.out.println("Enter the limiting length of series =");
    l=in.nextInt();
    double sum=1.0;
    for (i=1;i<l;i++)
    {
        f=f*i;
        sum=sum+((Math.pow(x,i))/f);
    }
    System.out.println("Sum of the series =" +sum);
    } 
}
