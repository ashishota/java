import java.util.Scanner;

public class q3 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array =");
        int size=sc.nextInt();
        int a[]=new int[size];
        int b[]=new int[size];
        int i,j=0;
        System.out.println("enter the elements of array =");
        for(i=0;i<size;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<size-1;i++)
        {
            if(a[i]!=a[i+1])
            {
            b[j]=a[i];
            j++;
            }
        }
        b[j]=a[size-1];
        size=j+1;
        System.out.println("New array :");
        for(i=0;i<size;i++)
        {
            System.out.print(b[i]+" ");
        }
    }
}
