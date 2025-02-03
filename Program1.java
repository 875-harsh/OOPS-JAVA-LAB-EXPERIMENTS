import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X, Y, N;
        while (true) {
            System.out.print("Enter the lower limit (X): ");
            X = scanner.nextInt();
            System.out.print("Enter the upper limit (Y): ");
            Y = scanner.nextInt();
            System.out.print("Enter the number of prime numbers to print (N): ");
            N = scanner.nextInt();

            if (X > 0 && Y > X && N > 0) {
                break;
            } else {
                System.out.println("Invalid input! Ensure X > 0, Y > X, and N > 0. Please try again.");
            }
        }

        printNPrimesInRange(X, Y, N);
        scanner.close();
    }
    public static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
    public static void printNPrimesInRange(int X, int Y, int N) {
        int count = 0;
        System.out.println("First " + N + " prime numbers in the range [" + X + ", " + Y + "]:");
        
        for (int i = X; i <= Y && count < N; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
                count++;
            }
        }
        
        if (count == 0) {
            System.out.println("No prime numbers found in the given range.");
        } else {
            System.out.println();
        }
    }
}
