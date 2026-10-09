import java.util.*;

public class Armstrong{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number: ");

        int num = scan.nextInt();
        int original = num;
        int sum = 0;

        while(num != 0) {
            int digit = num % 10;
            sum = sum + (digit * digit * digit);
            num = num / 10;
        }
        
        if(sum == original)
            System.out.println("Armstrong");
        else
            System.out.println("Not Armstrong");

        scan.close();
    }
}
