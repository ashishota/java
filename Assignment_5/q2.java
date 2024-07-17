class point{
    private double xCo;
    private double yCo;

    public point(){
        this.xCo=0.0;
        this.yCo=0.0;
    }

    public point(double xCo,double yCo){
        this.xCo=xCo;
        this.yCo=yCo;
    }
    public void printPoint(){
        System.out.println("x-coordinate= "+this.xCo+"\ny-cordinate= "+this.yCo);
    }

}

class Circle extends point{
    private double radius;
    public Circle (){
        this.radius=0.0;
    }

    public Circle(double x,double y,double radius){
        super(x,y);
        this.radius=radius;
    }
    public void printCircle(){
        System.out.println("Radius= "+this.radius);
    }

}

class Cylinder extends Circle{
    private double height;
    public Cylinder (){
        this.height=0.0;
    }

    public Cylinder(double x,double y,double z,double height){
        super(x,y,z);
        this.height=height;
    }
    public void printCylinder(){
        System.out.println("height= "+this.height);
    }

}

public class q2 {
    public static void main(String[] args) {
        Cylinder A=new Cylinder(12.0,13.0,14.0,15.0);
        A.printCylinder();
        A.printCircle();
        A.printPoint();

        
    }
}
