import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        int[] numbers = { 10, 20, 30, 40, 50 };
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the index position to get the value from the array: ");
        
        while (true) {
            try {
                int index = scanner.nextInt();
                int value = numbers[index];
                System.out.println("Value at index " + index + " is: " + value);
                break; 
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Error: Index out of bounds. Please enter a valid index.");
                scanner.nextLine(); 
            }
        }

        scanner.close();
    }
}

