class q1 {
    public static void main(String[] args) {
        String days = "Monday Tuesday Wednesday Thursday Friday Saturday Sunday";
        String[] daysArray = days.split(" ");
        reverseArray(daysArray);
        String reversedDays = String.join(" ", daysArray);
        System.out.println(reversedDays);
    }
    private static void reverseArray(String[] array) {
        int start = 0;
        int end = array.length - 1;
        while (start < end) {
            String temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }
}

