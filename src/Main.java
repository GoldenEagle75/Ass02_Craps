import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rnd = new Random();

        boolean done;
        int die1;
        int die2;
        int dieSum;
        int pointNumber;
        String userContinue;
        do {
            done = false;
            die1 = rnd.nextInt(1,7);
            die2 = rnd.nextInt(1,7);
            dieSum = die1 + die2;
            System.out.println("You rolled a " + die1 + " and " + die2 + ", amounting to " + dieSum + ".");

            if (dieSum == 2 || dieSum == 3 || dieSum == 12) {
                System.out.println("You crapped out. \nA loss.");
            } else if (dieSum == 7 || dieSum == 11) {
                System.out.println("You got a natural. \nA win!");
            } else {
                System.out.println(dieSum + " is now your point value.");
                pointNumber = dieSum;
                while (!done) {
                    die1 = rnd.nextInt(1, 7);
                    die2 = rnd.nextInt(1, 7);
                    dieSum = die1 + die2;
                    System.out.println("You rolled a " + die1 + " and " + die2 + ", amounting to " + dieSum + ".");

                    if (dieSum == pointNumber) {
                        System.out.println("Made point and won.");
                        done = true;
                    } else if (dieSum == 7) {
                        System.out.println("Got a seven and lost.");
                        done = true;
                    } else {
                        System.out.println("Trying for point.");
                    }
                }
            }

            System.out.print("Would you like to play again [Y/N]? ");
            userContinue = in.nextLine();

        }while (userContinue.equalsIgnoreCase("Y"));
    }
}