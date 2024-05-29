
import java.util.Scanner;

class Bank {
   double Balance;
   int Pin = 1245;

   public void checkPin() {

      System.out.print("Enter your pin: ");
      Scanner inp = new Scanner(System.in);
      int enterPin = inp.nextInt();
      if (enterPin == Pin) {
         Menu();
      } else {
         System.out.println("Try Again! Please enter the correct pin");
         checkPin();
      }
   }

   public void Menu() {

      System.out.println("Enter your Choice: ");
      System.out.println("1. Check A/C Balance ");
      System.out.println("2. Withdraw Money");
      System.out.println("3. Deposit Money");
      System.out.println("4. Exit");
      Scanner inp = new Scanner(System.in);
      int option = inp.nextInt();
      switch (option) {
         case 1:
            Checkbalance();
            break;
         case 2:
            WithdrawMoney();
            break;
         case 3:
            DepositMoney();
            break;
         case 4:
            break;
         default:
            System.out.println("Enter a valid choice");
            break;
      }
   }

   public void Checkbalance() {
      System.out.printf("Your Current Balance is: %.2f\n", Balance);
      Menu();
   }

   public void WithdrawMoney() {
      System.out.print("Enter WithDraw Amount: ");
      Scanner inp = new Scanner(System.in);
      double Amount = inp.nextDouble();
      if (Amount > Balance) {
         System.out.println("Insufficient Balance!");

      } else {
         Balance -= Amount;
         System.out.println("Withdrawn Sucessfull..");
         System.out.printf("Current Balance is: %.2f\n", Balance);

      }
      Menu();
   }

   public void DepositMoney() {
      System.out.print("Enter the Deposit Amount: ");
      Scanner inp = new Scanner(System.in);
      double Amount = inp.nextDouble();
      System.out.println("Money Deposited Successfully..");
      System.out.printf("Your Current Balance : %.2f\n", (Balance += Amount));
      Menu();
   }

}

public class ATM_Machine {
   public static void main(String[] args) {
      // A Atm interface like withdrawn , deposit , balance check
      System.out.println("\n--------------------------------------------------------------------\n");
      System.out.println("Hello and Welcome!\r\n" + //
            "\r\n" + //
            "We're delighted to assist you today. Let's make your banking quick and easy.");
      Bank Function = new Bank();
      Function.checkPin();

   }
}
