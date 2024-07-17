import java.util.Scanner;

public class q6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String inputString = scanner.nextLine();
        countAndPrintCharacterOccurrences(inputString);
        scanner.close();
    }
    private static void countAndPrintCharacterOccurrences(String str) {
        int[] countArray = new int[256]; 
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            countArray[ch]++;
        }
        for (int i = 0; i < countArray.length; i++) {
            if (countArray[i] > 0) {
                System.out.println("The Character " + (char) i + " has occurred " +countArray[i] + " times");
            }
        }
    }
}
