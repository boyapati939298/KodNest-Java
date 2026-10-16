import java.util.Scanner;

public class ClassStudents {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number of classes (rows): ");
        int cls = scan.nextInt();

        System.out.print("Enter number of students per class: ");
        int std = scan.nextInt();

        int[][] arr = new int[cls][std];

        System.out.println("Enter the marks for each student:");
        for (int i = 0; i < cls; i++) {
            for (int j = 0; j < std; j++) {
                System.out.print("Class " + (i + 1) + ", Student " + (j + 1) + ": ");
                arr[i][j] = scan.nextInt();
            }
        }

        System.out.println("\n--- Displaying Marks ---");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("Class " + (i + 1) + " Student " + (j + 1) + " Marks: " + arr[i][j]);
            }
            System.out.println();
        }

        scan.close();
    }
}
