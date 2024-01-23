import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

    private static final String ROCK = "Rock";
    private static final String PAPER = "Paper";
    private static final String SCISSORS = "Scissors";

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.print("\nChoose [r]ock, [p]aper or [s]cissors: ");
            String playerMove = scanner.nextLine();

            if (playerMove.equals("r") || playerMove.equals("rock")) {
                playerMove = ROCK;
            } else if (playerMove.equals("p") || playerMove.equals("paper")) {
                playerMove = PAPER;
            } else if (playerMove.equals("s") || playerMove.equals("scissors")) {
                playerMove = SCISSORS;
            } else {
                System.out.println("Invalid Input. Try again...");
                return;
            }

            Random random = new Random();
            int computerRandomNumber = random.nextInt(4);

            String computerMove = "";

            switch (computerRandomNumber) {
                case 0:
                    computerMove = ROCK;
                    break;
                case 1:
                    computerMove = PAPER;
                    break;
                case 2:
                    computerMove = SCISSORS;
                    break;
                case 3:
                    computerMove = ROCK;
                    break;
            }

            System.out.printf("%nThe computer choose %s%n", computerMove);

            if ((playerMove.equals(ROCK) && computerMove.equals(SCISSORS)) ||
                    (playerMove.equals(PAPER) && computerMove.equals(ROCK)) ||
                    (playerMove.equals(SCISSORS) && computerMove.equals(PAPER))) {
                System.out.println("You win.");
            } else if ((playerMove.equals(ROCK) && computerMove.equals(PAPER)) ||
                    (playerMove.equals(PAPER) && computerMove.equals(SCISSORS)) ||
                    (playerMove.equals(SCISSORS) && computerMove.equals(ROCK))) {
                System.out.println("You lose.");
            } else {
                System.out.println("This game was a draw.");
            }


            System.out.println("\nDo you want to continue? [Yes] or [No] ?..");
            String yesOrNo = scanner.nextLine();

            if (yesOrNo.equals("Yes")) {
                continue;
            } else {
                System.out.println("\nGame over.");
                break;
            }
        }

    }
}
