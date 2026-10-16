import java.util.*;

public class MinInRow{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of rows : ");
        int row = scan.nextInt();
        System.out.print("Enter number of columns : ");
        int col = scan.nextInt();
        int[][] arr = new int[row][col];

        for(int i = 0;i<arr.length;i++) {
            for(int j = 0;j<arr[i].length;j++){
                arr[i][j] = scan.nextInt();
            }
        }

        for(int i = 0;i<arr.length;i++) {
            int min = arr[i][0];
            for(int j = 1;j<arr[i].length;j++){
                if(min>arr[i][j]){
                    min = arr[i][j];
                }
            }
            System.out.println("Minimum in row " + (i+1) + " is " + min);
        }

        scan.close();
        
    }
}