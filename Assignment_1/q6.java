import  java.util.Scanner;
class q6
{
public static void main(String args[])
{
    Scanner in= new Scanner(System.in);
    int m,n,t=0;
    System.out.println("Enter two numbers (n<m) =");
    n=in.nextInt();
    m=in.nextInt();
    while(m%n!=0)
    {
        t=m%n;
        m=n;
        n=t;
    }
    System.out.println("GCD of two no ="+n);
}
}