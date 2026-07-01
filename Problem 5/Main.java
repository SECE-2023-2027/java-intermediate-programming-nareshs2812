import java.util.Scanner;

class Vehicle {
    public String startEngine() {
        return "Vehicle engine started";
    }
}

class Car extends Vehicle {
    public String startEngine() {
        return "Car engine roars";
    }
}

class Motorcycle extends Vehicle {
    public String startEngine() {
        return "Motorcycle engine revs";
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of vehicles: ");
        int n = sc.nextInt();

        Vehicle[] vehicles = new Vehicle[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter type (1-Car, 2-Motorcycle): ");
            int choice = sc.nextInt();

            if (choice == 1) {
                vehicles[i] = new Car();
            } else {
                vehicles[i] = new Motorcycle();
            }
        }

        System.out.println("\nStarting Engines:");

        for (Vehicle v : vehicles) {
            System.out.println(v.startEngine());
        }

        sc.close();
    }
}