import java.util.Scanner;
class q3
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int n,i;
        System.out.println("Enter the no =");
        n=sc.nextInt();
        int flag =0;
        for(i=2;i<=n/2;i++)
        {
            if(n%i==0)
            {
                flag=1;
                break;
            }
        }
        if (flag==0){
        System.out.println(n + "is prime");
        }else{
            System.out.println(n + "is composite");
        }
        sc.close();
        
    } 
}
