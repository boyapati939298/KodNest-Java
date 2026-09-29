import java.util.Scanner;

class Student {
    int id;
    String Name;
    String Course;
    double JavaScore;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student st1 = new Student();
        Student st2 = new Student();

        System.out.println("Enter Student 1 details");
        st1.id = sc.nextInt();
        st1.Name = sc.next();
        st1.Course = sc.next();
        st1.JavaScore = sc.nextDouble();

        System.out.println("Enter Student 2 details");
        st2.id = sc.nextInt();
        st2.Name = sc.next();
        st2.Course = sc.next();
        st2.JavaScore = sc.nextDouble();

        System.out.println("Student 1 Profile");
        System.out.println("ID: " + st1.id);
        System.out.println("Name: " + st1.Name);
        System.out.println("Course: " + st1.Course);
        System.out.println("JavaScore: " + st1.JavaScore);
        
        System.out.println("Student 2 Profile");
        System.out.println("ID: " + st2.id);
        System.out.println("Name: " + st2.Name);
        System.out.println("Course: " + st2.Course);
        System.out.println("JavaScore: " + st2.JavaScore);

        sc.close();
    }
}
