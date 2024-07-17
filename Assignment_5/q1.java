import java.util.Scanner;
class Complex {
    private double real;
    private double imaginary;
    public Complex() {
        this.real = 0.0;
        this.imaginary = 0.0;
    }
    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }
    public Complex add(Complex other) {
        return new Complex(this.real + other.real, this.imaginary + other.imaginary);
    }
    public Complex subtract(Complex other) {
        return new Complex(this.real - other.real, this.imaginary - other.imaginary);
    }
    public Complex multiply(Complex other) {
        double resultReal = this.real * other.real - this.imaginary * other.imaginary;
        double resultImaginary = this.real * other.imaginary + this.imaginary * other.real;
        return new Complex(resultReal, resultImaginary);
    }
    public Complex divide(Complex other) {
        double denominator = other.real * other.real + other.imaginary * other.imaginary;
        double resultReal = (this.real * other.real + this.imaginary * other.imaginary) / denominator;
        double resultImaginary = (this.imaginary * other.real - this.real * other.imaginary) / denominator;
        return new Complex(resultReal, resultImaginary);
    }
    public void display() {
        System.out.println("Result: " + real + " + " + imaginary + "i");
    }
}
public class q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter real part of the first complex number:");
        double real1 = scanner.nextDouble();
        System.out.println("Enter imaginary part of the first complex number:");
        double imaginary1 = scanner.nextDouble();
        Complex complex1 = new Complex(real1, imaginary1);
        System.out.println("Enter real part of the second complex number:");
        double real2 = scanner.nextDouble();
        System.out.println("Enter imaginary part of the second complex number:");
        double imaginary2 = scanner.nextDouble();
        Complex complex2 = new Complex(real2, imaginary2);

        Complex sum = complex1.add(complex2);
        Complex difference = complex1.subtract(complex2);
        Complex product = complex1.multiply(complex2);
        Complex quotient = complex1.divide(complex2);

        System.out.println("\nSum:");
        sum.display();
        System.out.println("\nDifference:");
        difference.display();
        System.out.println("\nProduct:");
        product.display();
        System.out.println("\nQuotient:");
        quotient.display();
    }
} 
