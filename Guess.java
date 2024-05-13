import java.util.Scanner;

public class Guess{
     public void GuessTheNumber(){
       Scanner input= new Scanner(System.in);
       GenerateNumber generate=new GenerateNumber();

       int score = 0;
       boolean playAgain=true;
       while (playAgain) {
              int attempts = 0;
              int TargetNumber = generate.Generate();
              boolean Flag=false;
              System.out.println("Welcome to the Number Guessing Game!");
              System.out.println("I've picked a number between 1 and 100. Try to guess it.");
              while (!Flag && attempts < 6) {
                     System.out.print("Enter your guess: ");
                     int GuessedNumber = input.nextInt();
                     attempts++;
                     if (GuessedNumber == TargetNumber) {
                            System.out.println("Congratulations! You've guessed the correct number in " + attempts + " attempts.");
                           Flag = true;
                            score += 100 - (attempts * 10);
                        } else if (GuessedNumber < TargetNumber) {
                            System.out.println("Too low! Try again.");
                        } else {
                            System.out.println("Too high! Try again.");
                        }
              }
              if (!Flag) {
                     System.out.println("Sorry, you've used all your attempts. The correct number was: " + TargetNumber);
                 }
                 System.out.println("Your current score: " + score);
            System.out.print("Do you want to play again? (yes/no): ");
            String playAgainResponse = input.next().toLowerCase();
            playAgain = playAgainResponse.equals("yes") || playAgainResponse.equals("y");
       }
       System.out.println("Thanking You");
}
}