import java.util.Scanner;
class q2
{
    public static void main(String args[])
    {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the size of array =");
    int size=sc.nextInt();
    int a[]=new int[size];
    int i,j,t;
    System.out.println("enter the elements of array =");
    for(i=0;i<size;i++)
        {
        a[i]=sc.nextInt();
        }
        for(i=0;i<size-1;i++)
        {
            for(j=0;j<(size-1-i);j++)
            {
                if(a[j+1]<a[j])
                {
                    t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                }
            }
        }
    System.out.println("Sorted elements of the array :");
    for(i=0;i<size;i++)
    {
        System.out.print(a[i]+" ");
    }
    }
} 


