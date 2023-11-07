import java.util.Scanner;
public class InteractiveOrderSystem 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        double totalAmount = 0;
        int totalQty = 0;
        
        System.out.println("Menu:");
        System.out.println("1. C1 - Php 100.00");
        System.out.println("2. C2 - Php 150.00");
        System.out.println("3. C3 - Php 200.00");
        System.out.println("4. R1 - Php 35.00");
        System.out.println("5. R2 - Php 50.00");
        System.out.println("6. Checkout");
        
        boolean checkout = false;
        
        while (!checkout) 
        {
            System.out.print("Enter your choice (1-6): ");
            int choice = scanner.nextInt();
            int quantity;
            double price = 0;
            
            switch (choice) 
            {
                case 1:
                    price = 100.00;
                    break;
                case 2:
                    price = 150.00;
                    break;
                case 3:
                    price = 200.00;
                    break;
                case 4:
                    price = 35.00;
                    break;
                case 5:
                    price = 50.00;
                    break;
                case 6:
                    checkout = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    continue;
            }
            
            if (choice >= 1 && choice <= 5) {
                System.out.print("Enter quantity: ");
                quantity = scanner.nextInt();
                totalQty += quantity;
                totalAmount += (price * quantity);
                System.out.println("Item(s) added to your order.");
            }
        }
        
        // Conversion rate from PHP to USD
        double conversionRate = 0.020;
        double totalAmountInUSD = totalAmount * conversionRate;
        
        // Displaying the summary
        System.out.println("Order Summary:");
        System.out.println("Total Quantity: " + totalQty);
        System.out.println("Total Price in PHP: Php " + totalAmount);
        System.out.println("Total Price in USD: $" + totalAmountInUSD);
        
        scanner.close();
    }
}
