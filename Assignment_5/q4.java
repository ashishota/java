class Point {
    private double xCo;
    private double yCo;

    public Point() {
        this.xCo = 0.0;
        this.yCo = 0.0;
    }

    public Point(double xCo, double yCo) {
        this.xCo = xCo;
        this.yCo = yCo;
    }
    public void printPoint(){
        System.out.println("Point x-coordinate= "+this.xCo+"\nPoint y-cordinate= "+this.yCo);
    }
    public void showCurrentClass() {
        System.out.println("This is point class");
    }
}

class Circle extends Point {
    private double radius;

    public Circle() {
        super();
        this.radius = 0.0;
    }

    public Circle(double x, double y, double radius) {
        super(x, y);
        this.radius = radius;
    }

    @Override
    public void showCurrentClass() {
        System.out.println("This is Cicle Class");
    }

    public void printCircle() {
        System.out.println("Circle - Radius= " + this.radius);
    }
}

class Cylinder extends Circle {
    private double height;

    public Cylinder() {
        super();
        this.height = 0.0;
    }

    public Cylinder(double x, double y, double radius, double height) {
        super(x, y, radius);
        this.height = height;
    }

    @Override
    public void showCurrentClass() {
        System.out.println("This is Cylinder Class");
    }

    public void printCylinder() {
        System.out.println("Cylinder - Height= " + this.height);
    }
}

public class q4 {
    public static void main(String[] args) {
        Point A = new Cylinder(12.0, 13.0, 14.0, 15.0);
        A.showCurrentClass();
        A.printPoint(); 
    }
}


