import java.util.Scanner;
    class Stack
    {
        int arr[];
        int size;
        int top;
        void create(int s)
        {
            size=s;
            top=-1;
            arr=new int[size];
        }
        void push(char ele)
        {
            if(top==size-1)
            System.out.println("Overflow");
            else
            {
            top=top+1;
            arr[top]=ele;
            }
        }
        int pop()
        {
            if(top==-1)
            {
                System.out.println("Underflow");
                return -1;
            }
            else
            {
                int item = arr[top];
                top = top - 1;
                return item;
            }
        }
    }
    class q1
    {
        public static void main(String args[])
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the string =");
            String s=sc.nextLine();
            int l=s.length();
            Stack s1 = new Stack();
            s1.create(l);
            for(int i=0;i<l;i++)
            {
                s1.push(s.charAt(i));
            }
            for(int i=0;i<l;i++)
            {
                System.out.print( (char)(s1.pop()));
            }
        }
    } 
     

