import java.util.Scanner;
public class BankTransactionHistory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double balance = 0.0;
        int choice;
        do {
            System.out.println("Choose an option:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Quit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = scanner.nextDouble();
                    if (depositAmount > 0) {
                        balance += depositAmount;
                        System.out.println("Successfully deposited $" + depositAmount);
                    } else {
                        System.out.println("Deposit amount must be positive.");
                    }
                    break;

                case 2:
                
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawalAmount = scanner.nextDouble();
                    if (withdrawalAmount > 0 && withdrawalAmount <= balance) {
                        balance -= withdrawalAmount;
                        System.out.println("Successfully withdrew " + withdrawalAmount);
                    } else if (withdrawalAmount > balance) {
                        System.out.println("Insufficient funds. Current balance: " + balance);
                    } else {
                        System.out.println("Withdrawal amount must be positive");
                    }
                    break;

                case 3:
                    System.out.println("Exiting the system. Thank you for using our service!");
                    break;

                default:
                    System.out.println("Invalid choice. Please choose a valid option.");
            }

            if (choice == 1 || choice == 2) {
                System.out.println("Updated balance: " + balance);
            }

        } 

    }
}
