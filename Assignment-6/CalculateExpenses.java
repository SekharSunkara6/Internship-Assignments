import java.util.Scanner;

public class CalculateExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter quantity purchased: ");
        int quantity = scanner.nextInt();

        System.out.print("Enter price per item: ");
        double pricePerItem = scanner.nextDouble();
        
        double discount = (quantity > 50) ? 0.1 : (quantity >= 25 && quantity <= 50) ? 0.05 : 0;
        double totalExpenses = quantity * pricePerItem * (1 - discount);

        System.out.println("Total expenses: $" + totalExpenses);

        scanner.close();
    }
}
