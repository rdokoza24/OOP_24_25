package pckg_guess_age;

import java.util.Scanner;

public class TestGame {

    public static void main(String[] args) {
        int age = AUX_CLS.generateRandomAge();
        System.out.println("Generated random age " + age);
        Scanner scanner = new Scanner(System.in);
        int guess = AUX_CLS.enterGuess(scanner);
    }
}
