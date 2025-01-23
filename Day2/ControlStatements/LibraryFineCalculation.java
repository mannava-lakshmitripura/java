import java.util.Scanner;
public class LibraryFineCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of books to calculate fines: ");
        int bookCount = sc.nextInt();
        for (int i = 1; i <= bookCount; i++) {
            System.out.println("Processing Book " + i);
            System.out.print("Enter the number of overdue days for Book " + i + ": ");
            int overdueDays = sc.nextInt();

            double fine = 0;
            if (overdueDays <= 7) {
                fine = overdueDays * 1; 
            } else {
                fine = (7 * 1) + ((overdueDays - 7) * 2); 
            }

            System.out.println("Total fine for Book " + i + "" + fine);
        }
    }
}
