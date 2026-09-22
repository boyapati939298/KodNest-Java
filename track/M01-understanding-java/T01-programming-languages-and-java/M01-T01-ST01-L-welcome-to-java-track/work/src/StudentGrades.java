import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter marks for 5 subjects:");
        int m1 = scan.nextInt();
        int m2 = scan.nextInt();
        int m3 = scan.nextInt();
        int m4 = scan.nextInt();
        int m5 = scan.nextInt();
        
        // Check for invalid marks (< 0 or > 100 in any subject)
        String result = (m1 < 0 || m1 > 100 || m2 < 0 || m2 > 100 || 
                         m3 < 0 || m3 > 100 || m4 < 0 || m4 > 100 || 
                         m5 < 0 || m5 > 100) 
                        ? "Invalid Marks" 
                        : calculateDetails(m1, m2, m3, m4, m5);
        
        System.out.println(result);
        scan.close();
    }
    
    public static String calculateDetails(int m1, int m2, int m3, int m4, int m5) {
        double totalMarks = m1 + m2 + m3 + m4 + m5;
        double percentage = (totalMarks / 500.0) * 100.0;
        
        // Ternary for grade classification based on percentage
        String grade = (percentage < 40) ? "Fail" 
                     : (percentage <= 59) ? "Pass" 
                     : (percentage <= 74) ? "First Class" 
                     : "Distinction";
        
        // Ternary for scholarship eligibility
        String scholarship = (percentage >= 85 && m1 >= 75 && m2 >= 75 && m3 >= 75 && m4 >= 75 && m5 >= 75) 
                             ? "Eligible" 
                             : "Not Eligible";
                             
        return "Total Marks: " + totalMarks + "\n" +
               "Percentage: " + percentage + "%\n" +
               "Result: " + grade + "\n" +
               "Scholarship: " + scholarship;
    }
}