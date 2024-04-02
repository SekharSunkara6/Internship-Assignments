import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Input array elements
        int[] numbers = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Calculate and display the sum of numbers divisible by both 5 and 2
        int sum = 0;
        for (int num : numbers) {
            if (num % 5 == 0 && num % 2 == 0) {
                sum += num;
            }
        }
        System.out.println("Sum of numbers divisible by both 5 and 2: " + sum);
        scanner.close();
    }
}

Output:
Enter the size of the array: 3
Enter the elements of the array:
5
10
15
Sum of numbers divisible by both 5 and 2: 10
