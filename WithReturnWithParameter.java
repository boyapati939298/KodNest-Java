public class WithReturnWithParameter {
    static int add(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static void main(String[] args) {
        int sum = add(10, 20);
        System.out.println(sum);
    }
}