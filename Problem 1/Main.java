import java.util.Scanner;

class Product {
    private String pId;
    private String pname;
    private double price;
    private int stock;

    public Product(String pId, String pname, double price, int stock) {
        this.pId = pId;
        this.pname = pname;

        this.price = (price < 0) ? 0.0 : price;
        this.stock = (stock < 0) ? 0 : stock;
    }

    public double getPrice() {
        return price;
    }

    public int getStockQuantity() {
        return stock;
    }

    public void applyDiscount(double percentage) {
        if (percentage > 0) {
            price -= price * percentage / 100;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter ID: ");
        String id = sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Price: ");
        double price = sc.nextDouble();

        System.out.print("Enter Stock: ");
        int stock = sc.nextInt();

        System.out.print("Enter Discount: ");
        double discount = sc.nextDouble();

        Product p = new Product(id, name, price, stock);
        p.applyDiscount(discount);

        System.out.println("\nFinal Price: " + p.getPrice());
        System.out.println("Stock: " + p.getStockQuantity());

        sc.close();
    }
}