# Slot Machine Game - Java

## Description
This is a simple command-line slot machine game written in Java. The player starts with a balance of $100 and can place bets to spin the slot machine. If the player wins based on the matching numbers, they earn winnings based on predefined payout rules. The game continues until the player decides to quit or runs out of money.

## How to Play

### Starting Balance
- You begin with a balance of $100.

### Placing Bets
- Enter the amount you want to bet.
- If you enter `0`, the game will end, and you'll leave with your current balance.
- If you enter `2`, you can place a double bet (must be at least $2).
- Bets cannot exceed your current balance.

### Spinning the Slots
- After placing your bet, the slot machine will spin and display three random numbers (0-7).
- If you match numbers, you win based on the payout rules.

### Winning Rules
- **MEGA JACKPOT**: All 7s (7 7 7) → Win **50x** your bet!
- **SUPER JACKPOT**: All 6s (6 6 6) → Win **30x** your bet!
- **JACKPOT**: Any three matching numbers → Win **10x** your bet!
- **Small Win**: Two matching numbers → Win **2x** your bet!
- If you don't match, you lose your bet.

### Game Over
- The game ends when your balance reaches $0.
- You can quit at any time by entering `0` as your bet.

## Requirements
- Java Development Kit (JDK) installed
- An Ide of your choice such as Visual studio etc
- have fun

## Running the Game
1. Compile the Java file using:
   ```sh
   javac SlotMachine.java
   ```
2. Run the compiled program:
   ```sh
   java SlotMachine
   ```

## Features
- Simple text-based slot machine game.
- Betting system with options for regular and double bets.
- Randomized slot spins with payout calculations.
- Interactive gameplay with balance tracking.

## Author
Developed by Soulsta
hope you have fun playing my simple slots hahahahaha
