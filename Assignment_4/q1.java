import java.util.Scanner;
class Employee
{
    private String empName;
    private String empNo;
    private int dependentCnt;
    Employee(String n, String eno, int d)
    {
        empName=n;
        empNo=eno;
        dependentCnt=d;
    }
    int depCount()
    {
        return dependentCnt;
    }
    void showEmpDetails()
    {
        System.out.println(empNo+"\t"+empName);
    }
}
class q1
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String en,eno;
        int d,n;
        System.out.println("\n Enter the nunmber of Employee =");
        n=sc.nextInt();
        Employee e[]= new Employee[n];
        for (int i=0;i<n;i++)
        {
            System.out.println("\n Enter the details of Employee "+(i+1)+" : ");
            System.out.print("Enter the Employee Name : ");
            en=sc.next();
            System.out.print("Enter the Employee Number : ");
            eno=sc.next();
            System.out.print("Enter the Number of Dependent : ");
            d=sc.nextInt();
            e[i]=new Employee(en,eno,d);
        }
        System.out.println("\n Deatails of the Employee... ");
        for (int i=0;i<n;i++)
        {
            if(e[i].depCount()>2)
            {
            e[i].showEmpDetails();
            }
        }
    }
}
