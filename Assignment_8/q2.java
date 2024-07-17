class SquareThread extends Thread {
    int num;
    public SquareThread(int num) {
        this.num = num;
    }
    public void run() {
        int square = num * num;
        System.out.println("Square of " + num + " is " + square);
        DigitSumThread digitSumThread = new DigitSumThread(square);
        digitSumThread.start();
    }
}
class DigitSumThread extends Thread {
    int num;
    public DigitSumThread(int num) {
        this.num = num;
    }
    public void run() {
        int digitSum = 0;
        while (num > 0) {
            digitSum += num % 10;
            num /= 10;
        }
        System.out.println("Sum of digits of the square is " + digitSum);
    }
}
public class q2 {
    public static void main(String[] args) {
        int num = 21;
        SquareThread squareThread = new SquareThread(num);
        squareThread.start();
    }
}
