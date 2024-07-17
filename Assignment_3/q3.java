class item
{
    String Name;
    int quantity;
    double price;
    item(String n, int q, double p)
    {
        Name=n;
        quantity=q;
        price=p;
    }
    String getName( )
    {
        return Name;
    }
    double getPrice( )
    {
        return price;
    }
    int getQuantity( )
    {
        return quantity;
    }
    double getValue( )
    {
        return (quantity * price);
    }
}
class q3
{
public static void main(String args[])
    {
        double total ;
        item i1=new item("Linc Pen",10, 7.0);
        item i2=new item("Pencil",5, 5.0);
        item i3=new item("Eraser",6,4.5);
        System.out.println("NAME"+"\t"+" QUANTITY"+"\t"+"PRICE"+"\t"+"VALUE");
        System.out.println(i1.getName() +"\t"+
        i1.getQuantity()+"\t"+i1.getPrice()+"\t"+i1.
        getValue());
        System.out.println(i2.getName() +"\t\t"+
        i2.getQuantity()+"\t"+i2.getPrice()+"\t"+i2.
        getValue());
        System.out.println(i3.getName() +"\t\t"+
        i3.getQuantity()+"\t"+i3.getPrice()+"\t"+i3.
        getValue());
        total=i1.getValue()+i2.getValue()+i3.getValue();
        System.out.println("\n Total Inventory is " +total);
    }
} 

