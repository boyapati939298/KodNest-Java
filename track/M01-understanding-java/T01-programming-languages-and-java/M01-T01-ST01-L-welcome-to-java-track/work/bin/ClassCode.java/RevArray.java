import java.util.Scanner;

public class RevArray {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int n = scan.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
            }

            System.out.print("Original Array: ");
            for (int i = 0; i < n; i++) {
                System.out.print(a[i] + " ");
            }

            System.out.print("\nReverse Array: ");
            for (int i = n - 1; i >= 0; i--) {
                System.out.print(a[i] + " ");
            }
        }
    }
}
