// Task 1:- Number Game
import java.util.Random;
import java.util.Scanner;

public class TaskOne {
    public static void main(String[] args) {
        System.out.println("****************************** Number Game ******************************\n");
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        int randNum = r.nextInt(101);
        boolean playAgain = true;
        int maxAttempts = 5;
        int noOfAttempts = maxAttempts;
        int totalRounds = 0;
        int roundsWon = 0;
        while (playAgain) {
            System.out.println("Enter a number:");
            int guessedNumber = sc.nextInt();
            if (guessedNumber < randNum) {
                System.out.println("The number you guessed is too low. Enter a higher number please!\t\t\t\t"
                        + "Attempts left: " + noOfAttempts + "\n\n");
                noOfAttempts--;
            } else if (guessedNumber > randNum) {
                System.out.println("The number you guessed is too high. Enter a lower number please!\t\t\t\t"
                        + "Attempts left: " + noOfAttempts + "\n\n");
                noOfAttempts--;

            } else {
                roundsWon++;
                totalRounds++;
                System.out.println("You guessed a correct number. You Won!");
                System.out.println("The number was " + randNum);
                float userScore = (float) noOfAttempts / maxAttempts * 10;
                System.out.println("Score = " + userScore + "\t\t\t\tMax Score = 10");
                System.out.println("\n\n\nDo you want to play again\n0 :- Yes\n1 :- No");
                if (sc.nextInt() == 1) {
                    playAgain = false;
                    break;
                }
                randNum = r.nextInt(101);
                System.out.println("The number was " + randNum);
                noOfAttempts = 5;
            }

            if (noOfAttempts < 0) {
                System.out.println("You exceeded the maximum attempts to guess a number. You Lost!\n\n");
                System.out.println("The number was " + randNum);
                totalRounds++;
                System.out.println("Do you want to play again\n0 :- Yes\n1 :- No");
                if (sc.nextInt() == 1) {
                    playAgain = false;
                    totalRounds++;
                    break;
                }
                randNum = r.nextInt(101);
                System.out.println("The number was " + randNum);
                noOfAttempts = 5;
            }
        }
        System.out.println("\n\nTotal Rounds you played = " + totalRounds);
        System.out.println("Rounds you won = " + roundsWon);
        System.out.println(
                "Total Game Score = " + ((float) roundsWon / totalRounds * 10) + "\t\t\t\tMax Game Score = 10");
        sc.close();
    }
}