
import java.util.Scanner;

public class InterFace {
 
    public static void main(String[] args) {
        for(int i=1;i<=1;i++){
            for(int j=1;j<=40;j++){
                System.out.print("--");
            }
        }
        System.out.println("\nWelcome to the Number Guessing Game!");
        System.out.println("1.Play\t2.Exit");
        Menu();
    }
    public static void Menu(){
       
        
        Guess Checking=new Guess();
        try (Scanner Options = new Scanner(System.in)) {
            String input=Options.next().toLowerCase();
            ReadTextFile Read=new ReadTextFile();

            switch (input) {
                case "1", "play":
                     Read.Rules();
                     for(int i=1;i<=5;i++){
                        for(int j=1;j<=60;j++){
                            System.out.print("--");
                        }
                        System.out.print("\n");
                     }
                     Checking.GuessTheNumber();
                    break;
                case "2","exit": System.out.println("Thanking You"); break;
                default : System.out.println("Thanking You");
                    break;
            }
        }
    }
    
}
