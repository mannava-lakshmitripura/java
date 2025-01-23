import java.util.Scanner;

public class CinemaSeatReservation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[][] seats = new char[5][5];
        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[i].length; j++) {
                seats[i][j] = 'A'; 
            }
        }

        boolean booking = true;

        while (booking) {
            System.out.println("  1 2 3 4 5");
            for (int i = 0; i < seats.length; i++) {
                System.out.print((i + 1) + " "); 
                for (int j = 0; j < seats[i].length; j++) {
                    System.out.print(seats[i][j] + " ");
                }
                System.out.println();
            }
            System.out.print("Enter row number : ");
            int row = scanner.nextInt() - 1; 
            System.out.print("Enter column number : ");
            int col = scanner.nextInt() - 1; 
            if (row >= 0 && row < 5 && col >= 0 && col < 5) {
                if (seats[row][col] == 'A') {
                    seats[row][col] = 'R'; 
                    System.out.println("Seat (" + (row + 1) + ", " + (col + 1) + ") has been reserved.");
                } else {
                    System.out.println("Sorry, seat  reserved.");
                }
            } else {
                System.out.println("Invalid seat selection");
            }
            System.out.print("Do you want to reserve another seat: ");
            String response = scanner.next();
            if (!response.equalsIgnoreCase("yes")) {
                booking = false;
            }
        }
    }
}
