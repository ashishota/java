 class q3 {
    public static void main(String[] args) {
            String[] names = {"Ram", "John", "Harish", "Anand", "Ajay"};
            sortNames(names);
            System.out.println("Sorted Names:");
            for (String name : names) {
                System.out.print(name + " ");
            }
        }
    private static void sortNames(String[] names) {
        int n = names.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (compareNames(names[j], names[j + 1]) > 0) {
                    String temp = names[j];
                    names[j] = names[j + 1];
                    names[j + 1] = temp;
                }
            }
        }
    }
    private static int compareNames(String name1, String name2) {
        return name1.compareTo(name2);
    }
}
