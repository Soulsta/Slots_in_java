import java.util.Random;
import java.util.Scanner;

public class SlotMachine {

    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int balance = 100; // Starting balance
        int bet;

        System.out.println("Welcome to a Simple Slot Machine using this simple java code print line!");
        System.out.println("You have $" + balance + " to start with.");

        while (balance > 0) {
            System.out.print("Enter your bet (Press 0 to quit, 2 to double your bet): ");
            int input = scanner.nextInt();

            if (input == 0) {
                System.out.println("Thanks for playing! You leave with $" + balance + ".");
                break;
            }

            // Handle double bet
            if (input == 2) {
                System.out.print("Enter your double bet amount: ");
                bet = scanner.nextInt();

                // Validate the double bet
                if (bet > balance) {
                    System.out.println("You don't have enough money to make that bet.");
                    System.out.println("Your current balance is $" + balance + ".");
                    continue;
                }

                if (bet < 2) {
                    System.out.println("Double bet must be at least $2.");
                    continue;
                }

                System.out.println("You doubled your bet to $" + bet + "!");
            } else {
                bet = input; // Set the bet to the input value
            }

            if (bet > balance) {
                System.out.println("You don't have enough money to make that bet.");
                System.out.println("Your current balance is $" + balance + ".");
                continue;
            }

            balance -= bet;

            // Simulate spinning animation
            System.out.println("Spinning...");
            for (int i = 0; i < 10; i++) {
                int temp1 = random.nextInt(8); // Range increased to include 7
                int temp2 = random.nextInt(8);
                int temp3 = random.nextInt(8);
                System.out.print("\rResults: " + temp1 + " " + temp2 + " " + temp3);
                Thread.sleep(200); // Delay for 200 milliseconds
            }

            // Generate final results
            int slot1 = random.nextInt(8); // Range increased to include 7
            int slot2 = random.nextInt(8);
            int slot3 = random.nextInt(8);
            System.out.print("\rResults: " + slot1 + " " + slot2 + " " + slot3);
            System.out.println();

            // Check for special jackpots
            if (slot1 == 7 && slot2 == 7 && slot3 == 7) {
                int winnings = bet * 50; // Big jackpot for all 7s
                balance += winnings;
                System.out.println("MEGA JACKPOT! All 7s! You won $" + winnings + "!");
            } else if (slot1 == 6 && slot2 == 6 && slot3 == 6) {
                int winnings = bet * 30; // Jackpot for all 6s
                balance += winnings;
                System.out.println("SUPER JACKPOT! All 6s! You won $" + winnings + "!");
            } else if (slot1 == slot2 && slot2 == slot3) {
                int winnings = bet * 10; // Regular jackpot for any three matching numbers
                balance += winnings;
                System.out.println("JACKPOT! You won $" + winnings + "!");
            } else if (slot1 == slot2 || slot2 == slot3 || slot1 == slot3) {
                int winnings = bet * 2; // Small win for two matching numbers
                balance += winnings;
                System.out.println("You won $" + winnings + "!");
            } else {
                System.out.println("Sorry, you lost your bet.");
            }

            System.out.println("Your current balance is $" + balance + ".");
        }

        if (balance <= 0) {
            System.out.println("You're out of money! Game over.");
        }

        scanner.close();
    }
}