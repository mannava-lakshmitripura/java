import java.util.Scanner;

public class QuizApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] questions = {
            "1. who is the CM of AP? \n   a) Revanth Reddy \n   b) pawankalyan \n   c) Chandrababunaidu \n   d) jagan",
            "2. what is the capital of AP?\n   a) hyderabad \n   b) amaravathi \n   c) mumbai \n   d) chennai",
            "3. Who wrote Ramayanam? \n   a) vyasa \n   b) valmiki \n   c) srikrishnadevaraya \n   d) writer"
        };

        char[] answers = {'c', 'b', 'b'}; 
        int score = 0;
        System.out.println(" select the correct option a, b, c, d");

        for (int i = 0; i < questions.length; i++) {
            System.out.println("\n" + questions[i]);
            System.out.print("Your answer: ");
            char userAnswer = scanner.next().toLowerCase().charAt(0);
            if (userAnswer == answers[i]) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Wrong! The correct answer is: " + answers[i]);
            }
        }

        System.out.println("Your score: " + score + "/" + questions.length);

        scanner.close();
    }
}
