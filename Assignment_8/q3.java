import java.util.Scanner;

class VectorProductThread extends Thread {
    int[] vector1, vector2, result;
    int start, end, step;

    public VectorProductThread(int[] vector1, int[] vector2, int[] result, int start, int end, int step) {
        this.vector1 = vector1;
        this.vector2 = vector2;
        this.result = result;
        this.start = start;
        this.end = end;
        this.step = step;
    }

    public void run() {
        for (int i = start; i < end; i += step) {
            result[i] = vector1[i] * vector2[i];
        }
    }
}

public class q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the vectors: ");
        int size = scanner.nextInt();

        int[] vector1 = new int[size];
        int[] vector2 = new int[size];
        int[] result = new int[size];

        System.out.println("Enter the elements of the first vector:");
        for (int i = 0; i < size; i++) {
            vector1[i] = scanner.nextInt();
        }

        System.out.println("Enter the elements of the second vector:");
        for (int i = 0; i < size; i++) {
            vector2[i] = scanner.nextInt();
        }

        VectorProductThread oddThread = new VectorProductThread(vector1, vector2, result, 1, size, 2);
        VectorProductThread evenThread = new VectorProductThread(vector1, vector2, result, 0, size, 2);

        oddThread.start();
        evenThread.start();

        try {
            oddThread.join();
            evenThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.print("The product of the two vectors is: [");
        for (int i = 0; i < size - 1; i++) {
            System.out.print(result[i] + ", ");
        }
        System.out.println(result[size - 1] + "]");
    }
}
