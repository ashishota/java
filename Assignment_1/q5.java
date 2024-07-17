import java.util.Scanner;
class q5
{
    public static void main(String args[])
    {
        Scanner in= new Scanner(System.in);
        int n,m,i,c=0,j;
        System.out.println("Enter two no =");
        n=in.nextInt();
        m=in.nextInt();
        for(i=n;i<=m;i++)
        {
            int flag=0;
            for(j=2;j<=i/2;j++)
            {
                if(i%j==0)
                {
                    flag=1;
                    break; 

                }
            }
            if (flag==0)
            c=c+1;
            
        }
        System.out.println("total prime no netween " + n +"and " + m + "= " +c);
    }
} 

