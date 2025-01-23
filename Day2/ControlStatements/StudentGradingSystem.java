import java.util.Scanner;
public class StudentGradingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int studentCount = scanner.nextInt();

        double totalGrades = 0;

        for (int i = 1; i <= studentCount; i++) {
            System.out.print("Enter the grade for Student " + i + ": ");
            double grade = scanner.nextDouble();
            totalGrades += grade;
            if (grade < 40) {
                System.out.println("Student " + i + " has failed");
            }
        }
        double averageGrade = totalGrades / studentCount;
        System.out.println("The average grade of the class is: " + averageGrade);

   
    }
}
