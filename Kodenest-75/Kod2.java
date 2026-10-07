import java.util.*;

public class Kod2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word1 = scanner.nextLine();
        String word2 = scanner.nextLine();
        System.out.println(mergeAlternately(word1, word2));
        scanner.close();
    }

    public static String mergeAlternately(String word1, String word2) {
        StringBuffer result = new StringBuffer();
        int n = Math.max(word1.length(), word2.length());
        for (int i = 0; i < n; i++) {
            if (i < word1.length()) {
                result.append(word1.charAt(i));
            }
            if (i < word2.length()) {
                result.append(word2.charAt(i));
            }
        }
        return result.toString();
    }
}