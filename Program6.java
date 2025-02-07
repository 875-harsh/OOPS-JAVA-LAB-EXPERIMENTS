import java.util.Scanner;

public class Program6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Convert to Binary");
            System.out.println("2. Convert to Hexadecimal");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter a number: ");
                    int numBinary = scanner.nextInt();
                    System.out.println("Binary equivalent: " + Integer.toBinaryString(numBinary));
                    break;
                case 2:
                    System.out.print("Enter a number: ");
                    int numHex = scanner.nextInt();
                    System.out.println("Hexadecimal equivalent: " + Integer.toHexString(numHex).toUpperCase());
                    break;
                case 3:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice! Please enter a valid option.");
            }
        } while (choice != 3);

        scanner.close();
    }
}