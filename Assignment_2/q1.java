import java.util.Scanner;
class q1
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array =");
        int size=sc.nextInt();
        int a[]=new int[size];
        int i;
        System.out.println("enter the elements of array =");
        for(i=0;i<size;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("enter the element to be searched =");
        int s=sc.nextInt();
        for(i=0;i<size;i++)
        {
            if(a[i]==s)
            {
            System.out.println("Search Successful ");
            break;
            }
        }
    }
} 
