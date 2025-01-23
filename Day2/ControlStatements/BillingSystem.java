import java.util.Scanner;

public class BillingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int customerCount;
        System.out.print("Enter the number of customers: ");
        customerCount = sc.nextInt();
        for (int i = 1; i <= customerCount; i++) {
            System.out.println("Processing for Customer " + i);
            double totalBill = 0;
            StringBuilder billDetails = new StringBuilder();
            while (true) {
                System.out.print("Enter the price of the item: ");
                double itemPrice = sc.nextDouble();
                if (itemPrice == 0) {
                    break;
                }

                totalBill += itemPrice;
                billDetails.append("Item - ").append(itemPrice).append("\n");
            }
            System.out.println("Bill for Customer " + i + ":");
            System.out.println(billDetails);
            System.out.println("Total Bill: " + totalBill);
        }
    }
}
