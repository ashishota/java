
package mypack;

public class display {
    public  display(int data) {
        System.out.println("Received int data: " + data);
    }

    public  display(float data) {
        System.out.println("Received float data: " + data);
    }

    public  display(int[] data) {
        System.out.print("Received int array data: ");
        for (int num : data) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public  display(String data) {
        System.out.println("Received String data: " + data);
    }

    public  display(String[] data) {
        System.out.print("Received String array data: ");
        for (String str : data) {
            System.out.print(str + " ");
        }
        System.out.println();
    }
}
