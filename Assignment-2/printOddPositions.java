import java.util.Scanner;

public class Main {

    public static void printOddPositions(String text) {
        for (int i = 0; i < text.length(); i++) {
            if (i % 2 != 0) {
                System.out.print(text.charAt(i));
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input text from the user
        System.out.print("Enter a text: ");
        String text = scanner.nextLine();

        // Print characters at odd positions
        System.out.print("Characters at odd positions: ");
        printOddPositions(text);

        scanner.close();
    }
}

Output:
Enter a text: Hello World
Characters at odd positions: el ol
