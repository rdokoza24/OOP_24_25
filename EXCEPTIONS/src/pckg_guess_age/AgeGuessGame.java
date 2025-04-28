package pckg_guess_age;

import java.util.ArrayList;
import java.util.Scanner;

public class AgeGuessGame {
    private static Scanner scanner;
    private static final ArrayList<Integer> ageGuesses = new ArrayList<>();

    public static void startGame(Player player){
        boolean continuePlay = true;
        scanner = new Scanner(System.in);
        int ageToGuess = AUX_CLS.generateRandomAge();
        while(continuePlay){
            AUX_CLS.inputGuessAge(scanner);
            logUserGuess(AUX_CLS.getAgeEntered());
            if (AUX_CLS.isGuess(ageToGuess)){
                System.out.println("You guessed the age: " + ageToGuess);
                continuePlay = false;
            }else {
                System.out.println("You guessed the age incorrectly!!");
                AUX_CLS.helperGuess(ageToGuess);
                continuePlay = continueToPlay();
            }
        }
        System.out.println("Thanks for playing!!");
        provideGameStat();
        player.addGameResults(ageGuesses);
    }
    public static boolean continueToPlay(){
        System.out.println("Do you want to continue playing?(y)");
        String answer = scanner.nextLine();
        return answer.equalsIgnoreCase("y");
    }
    public static void logUserGuess(int guess){
        ageGuesses.add(guess);
    }
    public static void provideGameStat(){
        System.out.println("================statistics===================");
        System.out.println("total guesses: " + ageGuesses.size());
        System.out.println("All attempts: " + ageGuesses);
    }
}