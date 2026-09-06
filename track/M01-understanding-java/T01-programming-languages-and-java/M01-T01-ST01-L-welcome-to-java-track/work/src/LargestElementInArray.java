public class LargestElementInArray {
    public static void main(String[] args) {

        int[] numbers = {10, 25, 7, 40, 15};

        int largest = numbers[0];

        for (int i = 1; i < numbers.length; i++) {

            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }

        System.out.println("Largest Element = " + largest);
    }
}