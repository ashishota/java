
class Student {
    String name;
   int markProg,markLogic;
    char gradeLab;
   Student(String s,int mp,int ml,char gl)
   {
    name=s;
    markProg=mp;
    markLogic=ml;
    gradeLab=gl;
   }
Student isStronger(Student s)
   {
        if(markProg>s.markProg)
            return this;
        else if(markProg==s.markProg && markLogic>s.markLogic)
            return this;
        else if(markProg==s.markProg && markLogic==s.markLogic)
            return this;
        else if(markProg==s.markProg && markLogic==s.markLogic && gradeLab==s.gradeLab)
            return null;
        else
            return s;
    }
}
class q4 {
    public static void main(String args[])
    {
        Student s1=new Student("Gautam",97,85,'B');
        Student s2=new Student("Pranav",95,99,'A');
        if(s1.isStronger(s2)==null)
            System.out.println("Performance of both are equal");
        else if(s1.isStronger(s2)==s1)
            System.out.println("First student is better");
        else 
            System.out.println("Second student is better");
   }
   } 
   
