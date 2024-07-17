class employee
{
    String empName;
    int empNo;
    double basicSal, da, hra, grossSal;
    employee(String n, int en, double b)
    {
        empName=n;
        empNo=en;
        basicSal=b;
    }
    void calGrossSal()
    {
        da=0.2*basicSal;
        hra=0.1*basicSal;
        grossSal= basicSal+da+hra;
    }
    void showEmpDetails()
    {
        System.out.println(empName+"\t"+empNo+"\t"+basicSal+"\t"+da+"\t"+hra+"\t"+grossSal);
    }
}
class q2
{
    public static void main(String args[])
    {
        employee e1=new employee("Rajesh", 1001,30000);
        employee e2=new employee("Pradip", 1002,40000);
        e1.calGrossSal();
        e2.calGrossSal();
        System.out.println("NAME"+"\t"+"EMPNO"+"\t"+"BASIC"+"\t"+"DA"+"\t"+"HRA"+"\t"+"GROSS SALARY");
        e1.showEmpDetails();
        e2.showEmpDetails();
    }
} 

