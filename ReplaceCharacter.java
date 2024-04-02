public class ReplaceCharacter {

    public static String replaceCharAt(String str, int index, char replaceChar) {
        if (index < 0 || index >= str.length()) {
            return "Invalid index";
        }

        char[] charArray = str.toCharArray();
        charArray[index] = replaceChar;
        return new String(charArray);
    }

    public static void main(String[] args) {
        String originalStr = "example";
        int indexToReplace = 2;
        char replaceChar = 'p';

        String modifiedStr = replaceCharAt(originalStr, indexToReplace, replaceChar);
        System.out.println("Original String: " + originalStr);
        System.out.println("Modified String: " + modifiedStr);
    }
}

Output:

Original String: example
Modified String: expmple
