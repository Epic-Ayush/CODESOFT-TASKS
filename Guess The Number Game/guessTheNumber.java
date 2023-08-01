import java.lang.Math;
import java.util.Scanner;

public class guessTheNumber {
    public static void main(String[] args)throws Exception
    {
        Scanner sc = new Scanner(System.in);

        int guess;
        int count = 0;
        int min = 1;
        int max = 100;
        char choice;

        //Generating the random number between 1 to 100
        int randNum = (int) (Math.random() * (max - min + 1) + min);
        do {

            //Take input from the user
            System.out.print("Please Enter the guess for generated number between 1 to 100 = ");
            guess = sc.nextInt();
            
            //Check the guessing number of user 
            if (guess < randNum) {
                System.out.println("To Low");
            } else if (guess == randNum) {
                System.out.println("Congratulations !!!!\nGuess Is Correct");
                break;

            } else {
                System.out.println("To High");
            }
            System.out.println("Do you want to continue ? (y/n) : y for yes and n for no");
            choice  = (char)System.in.read();
            count ++;

            //Valid Only 10 attemps
            if(count == 10)
            {
                System.out.println("--------Sorry Attempt Over--------\n--------Game Over--------");
                break;
            }

        } while (choice == 'y' || choice == 'Y');
        //Display the total attempts by user
        System.out.printf("Total %d Attempt",count);
        sc.close();

    }
}