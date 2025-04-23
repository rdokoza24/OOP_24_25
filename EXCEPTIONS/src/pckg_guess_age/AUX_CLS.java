package pckg_guess_age;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class AUX_CLS {

    private static final int min_age = 0;
    private static final int max_age = 139;


    public static int generateRandomAge(){
        return ThreadLocalRandom.current().nextInt(min_age, max_age + 1);
    }

    public static int enterGuess(Scanner scanner)  {
        System.out.println("Enter your guess("+min_age+"-"+max_age+"): ");
        int guess = scanner.nextInt();
        while(guess < 0 || guess > max_age){
            System.out.println("Invalid input, try again");
            guess = scanner.nextInt();
        }
        return guess;
    }
    public static int enterGuessInter(Scanner scanner)  {
        int guess = -1;
        try{
            System.out.println("Enter your guess(" + min_age + "-" + max_age + "): ");
            guess = scanner.nextInt();
        } catch (InputMismatchException e){
            System.out.println("Invalid input, please enter a valid number");
        }
        return guess;
    }
}
