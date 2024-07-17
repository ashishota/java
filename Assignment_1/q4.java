

import java.util.Scanner;
class q4
{
        public static void main(String args[])
    {
        Scanner in= new Scanner(System.in);
        int m,n,i,sum=0,c=0;
        System.out.println("Enter two numbers (M<N) =");
        m=in.nextInt();
        n=in.nextInt();
        for(i=n;i<=m;i++)
        {
            if ((i%3==0)&&(i%5==0))
            {
                System.out.println(i );
                c=c+1;
                sum=sum+i;
            }
        }
        System.out.println("total no = " +c );
        System.out.println("sum of no = "+sum);
        in.close();
    }
} 

