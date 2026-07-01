import java.util.Scanner;

class Student {
    private String name;
    private int[] marks;
    public Student(String name, int[] marks) {
        this.name = name;
        this.marks = marks;
    }
    public double calculateAverage() {
        if (marks == null || marks.length == 0) {
            return 0.0;
        }

        int sum = 0;
        for (int m : marks) {
            sum += m;
        }

        return (double) sum / marks.length;
    }
}
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("name: ");
        String name = sc.nextLine();
        System.out.print("no of subjects: ");
        int n = sc.nextInt();
        int[] marks = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter mark for sub " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }
        Student s = new Student(name, marks);
        System.out.println("Average marks: " + s.calculateAverage());
        sc.close();
    }
}