import java.util.Scanner;

public class CabDriver {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("New Cab Order Received!");
        System.out.println("Passenger: Rahul");
        System.out.println("Pickup: Bangalore");
        System.out.println("Drop: Electronic City");
        System.out.println("Fare: ₹350");

        System.out.println("\n1. Accept Order");
        System.out.println("2. Reject Order");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        if (choice == 1) {
            System.out.println("Order Accepted!");
            System.out.println("Driver is going to the pickup location.");
        } else if (choice == 2) {
            System.out.println("Order Rejected!");
            System.out.println("Order will be assigned to another driver.");
        } else {
            System.out.println("Invalid choice!");
        }

        sc.close();
    }
}