import java.util.Scanner;
import java.util.Random;

public class GuessTheNumber {

    static final int Max_Range=100;
    static final int Min_Range=1;
    static final int Max_Rounds=3;
    static final int Max_Attempts=10;

    public static void main(String[]args){
        Random random=new Random();
        Scanner sc=new Scanner(System.in);
        int totalScore=0;
        System.out.println("NUMBER GUESSING GAME");
        System.out.println("Total Number Of Rounds: 3");
        System.out.println("Attempts To Guess The Number In Each Round: 10\n");

        for(int i=1;i<=Max_Rounds;i++){
            int randomNumber=random.nextInt(Max_Range)+Min_Range;
            int attempts=0;
            System.out.printf("Round %d Guess The number between %d and %d in %d Attempts.\n",i,Min_Range,Max_Range,Max_Attempts);
            while(attempts<Max_Attempts){
                System.out.println("Enter Your Guess :");
                int guessNumber=sc.nextInt();
                attempts=attempts+1;
                if(guessNumber==randomNumber){
                    int score=Max_Attempts-attempts;
                    totalScore=totalScore+score;
                    System.out.printf("Hurray! Number Guessed Successfully. Attempts = %d . Round Score = %d.\n",attempts,score);
                    break;
                }else if(guessNumber<randomNumber){
                    System.out.printf("The Number Is Greater Than %d. Attempts Left : %d\n",guessNumber,Max_Attempts-attempts);
                }else{
                    System.out.printf("The Number Is Less Than %d. Attempts Left : %d\n",guessNumber,Max_Attempts-attempts);

                }
            }
            if(attempts==Max_Attempts){
                System.out.println("Sorry! You've used all attempts. The correct number was \n"+randomNumber);
            }
        }
        System.out.println("\nGame over! Your total score is: " + totalScore);
    }
}
