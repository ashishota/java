
class Shape {
    public void draw() {
        System.out.println("Drawing Shape");
    }
    public void erase() {
        System.out.println("Erasing Shape");
    }
}

class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing Circle");
    }
    @Override
    public void erase() {
        System.out.println("Erasing Circle");
    }
}
   
class Triangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing Triangle");
    }
    @Override
    public void erase() {
        System.out.println("Erasing Triangle");
    }
   }

class Square extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing Square");
    }
    @Override
    public void erase() {
        System.out.println("Erasing Square");
    }
}

public class q3 {
    public static void main(String[] args) {

    Circle circle = new Circle();
    Triangle triangle = new Triangle();
    Square square = new Square();

    Shape shape1 = circle;
    Shape shape2 = triangle;
    Shape shape3 = square;

    System.out.println("Using Circle object:");
    shape1.draw();
    shape1.erase();
    System.out.println("\nUsing Triangle object:");
    shape2.draw();
    shape2.erase();
    System.out.println("\nUsing Square object:");
    shape3.draw();
    shape3.erase();
    }
}
