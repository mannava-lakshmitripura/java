import java.util.Scanner;
import java.util.concurrent.TimeUnit;
public class OnlineExamTimer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the duration of the exam (in minutes): ");
        int totalMinutes = scanner.nextInt();

        while (totalMinutes > 0) {
            System.out.println(totalMinutes + " minute(s) remaining...");
            
            try {
                TimeUnit.MINUTES.sleep(1);
            } catch (InterruptedException e) {
                System.out.println("Timer interrupted!");
                break;
            }

            totalMinutes--; 
        }

        System.out.println("Time's up! The exam is over.");
        scanner.close();
    }
}
