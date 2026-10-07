import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] chocolates = new int[n];
        for (int i = 0; i < n; i++) {
            chocolates[i] = scanner.nextInt();
        }
        int extraChocolates = scanner.nextInt();
        System.out.println(kidsWithGreatestChocolates(chocolates, extraChocolates));
        scanner.close();
    }

    public static List<Boolean> kidsWithGreatestChocolates(int[] chocolates, int extraChocolates) {
        int max = chocolates[0];
        for (int i = 1; i < chocolates.length; i++) {
            if (chocolates[i] > max) {
                max = chocolates[i];
            }
        }
        
        List<Boolean> result = new ArrayList<>();
        for (int i = 0; i < chocolates.length; i++) {
            if (chocolates[i] + extraChocolates >= max) {
                result.add(true);
            } else {
                result.add(false);
            }
        }
        return result;
    }
}