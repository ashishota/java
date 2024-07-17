interface Calculator
{
    int add (int a, int b);
    int sub (int a, int b);
    int mul(int a, int b);
    int div (int a, int b);
}
class DemoCalculator implements Calculator
{
    public int add (int a, int b)
    {
        return (a+b);
    }
    public int sub (int a, int b)
    {
        return (a-b);
    }
    public int mul(int a, int b)
    {
        return (a*b);
    }
    public int div (int a, int b)
    {
        return (a/b);
    }
}


public class q2
{
    public static void main (String args[])
    {
        DemoCalculator c = new DemoCalculator();
        System.out.println("\n Sum = "+c.add(20,10));
        System.out.println("\n Difference = "+c.sub(20,10));
        System.out.println("\n Product = "+c.mul(20,10));
        System.out.println("\n Division = "+c.div(20,10));
    }
}
