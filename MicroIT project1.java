import java.util.*;
public class RockPaperScissors {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        int computerChoice;
        String userChoice;
        String[] choices = {"rock", "paper", "scissors"};

        while (true) {
            System.out.print("Enter your choice (rock, paper, scissors, or quit): ");
            userChoice = scanner.next().toLowerCase();

            if (userChoice.equals("quit")) {
                break;
            }

            if (!userChoice.equals("rock") && !userChoice.equals("paper") && !userChoice.equals("scissors")) {
                System.out.println("Invalid choice. Please try again.");
                continue;
            }

            computerChoice = rand.nextInt(3); // Generate a random number between 0 and 2
            System.out.println("Computer chose: " + choices[computerChoice]);

            if (userChoice.equals(choices[computerChoice])) {
                System.out.println("It's a tie!");
            } else if ((userChoice.equals("rock") && computerChoice == 2) ||
                       (userChoice.equals("paper") && computerChoice == 0) ||
                       (userChoice.equals("scissors") && computerChoice == 1)) {
                System.out.println("congratulations You win!");
            } else {
                System.out.println("Computer wins!");
            }
        }

        scanner.close();
    }
}