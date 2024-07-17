 class q2 {
    public static void main(String[] args) {
        String inputString = "String With Multiple Spaces";
        String resultString = removeMultipleSpaces(inputString);
        System.out.println("Original String: " + inputString);
        System.out.println("String without Multiple Spaces: " + resultString);
    }
    private static String removeMultipleSpaces(String input) {
        StringBuilder result = new StringBuilder();
        boolean spaceFound = false;
        for (char ch : input.toCharArray()) {
            if (ch == ' ') {
                if (!spaceFound) {
                    result.append(ch);
                    spaceFound = true;
                }else {
                result.append(ch);
                spaceFound = false;
                }
            }
        }
        return result.toString();
        
    }
}