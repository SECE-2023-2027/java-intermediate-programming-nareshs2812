import java.util.Scanner;

class Employee {

    protected String name;
    protected double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public double calculateSalary() {
        return salary;
    }
}

class Manager extends Employee {

    private double bonus;

    public Manager(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    public double calculateSalary() {
        return salary + bonus;
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Employee Details:");
        String empName = sc.nextLine();
        double empSalary = sc.nextDouble();
        sc.nextLine();

        System.out.println("Enter Manager Details:");
        String mgrName = sc.nextLine();
        double mgrSalary = sc.nextDouble();
        double bonus = sc.nextDouble();

        Employee emp = new Employee(empName, empSalary);
        Manager mgr = new Manager(mgrName, mgrSalary, bonus);

        System.out.println(emp.calculateSalary());
        System.out.println(mgr.calculateSalary());

        sc.close();
    }
}