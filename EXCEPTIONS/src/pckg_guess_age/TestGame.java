package pckg_guess_age;

import java.util.Scanner;

public class TestGame {
    private static Scanner scanner;
    public static void main(String[] args) {
        int age = AUX_CLS.generateRandomAge();
//        System.out.println(age);
        Scanner scanner = new Scanner(System.in);
//        AUX_CLS.enterGuess(scanner);
        AUX_CLS.inputGuessAge(scanner);
        System.out.println("Your guess is: " + AUX_CLS.getAgeEntered());

    }
}