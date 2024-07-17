import mypack.display;

public class q1 {
    public static void main(String[] args) {
        int intData = 10;
        float floatData = 5.5f;
        int[] intArrayData = {1, 2, 3, 4, 5};
        String stringData = "Hello";
        String[] stringArrayData = {"One", "Two", "Three"};

        display intDisplay = new display(intData);
        display floatDisplay = new display(floatData);
        display intArrayDisplay = new display(intArrayData);
        display stringDisplay = new display(stringData);
        display stringArrayDisplay = new display(stringArrayData);
    }
}

