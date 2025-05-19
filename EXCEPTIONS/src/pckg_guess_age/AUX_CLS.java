package pckg_guess_age;

import java.io.*;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class AUX_CLS {

    public static final int MIN_AGE = 1;
    public static final int MAX_AGE = 139;
    private static int ageEntered;

    public static int generateRandomAge() {
        return ThreadLocalRandom.current().nextInt(MIN_AGE, MAX_AGE + 1);

    }

    public static void inputGuessAge(Scanner scanner) {
        boolean isValid = false;
        System.out.println("Enter your age guess:");
        try {
            int guess = scanner.nextInt();
            System.out.println("Your guess is: " + guess);
            if (wrongAgeInputRange(guess)) {
                System.out.println("Your guess is out of range, try again!!");

            } else {
                isValid = true;
                ageEntered = guess;
            }
        } catch (InputMismatchException ime) {
            System.out.println("Invalid input, enter integer!!");
            scanner.nextLine();
        } finally {
            if (isValid) {
                System.out.println("Your guess is valid!!");
                scanner.nextLine();
            } else {
                System.out.println("Your guess is invalid!!");
                inputGuessAge(scanner);
            }
        }
    }

    public static void enterGuess(Scanner scanner) {
        System.out.println("Enter your age guess: ");
        while (true) {
            try {
                int guess = scanner.nextInt();
                System.out.println("Your guess is: " + guess);
                if (wrongAgeInputRange(guess)) {
                    System.out.println("Your guess is out of range, try again!!");
                } else {
                    ageEntered = guess;
                    break;
                }
            } catch (InputMismatchException ime) {
                System.out.println("Invalid input, enter integer!!");
                scanner.nextLine();
            }
        }

    }

    public static boolean wrongAgeInputRange(int guessInput) {
        return (guessInput < MIN_AGE || guessInput > MAX_AGE);
    }

    public static int getAgeEntered() {
        return ageEntered;

    }

    public static boolean isGuess(int valueToGuess) {
        return (valueToGuess == ageEntered);
    }

    public static void helperGuess(int ageToGuess) {
        System.out.println("======================helper=========================");
        if (ageEntered < ageToGuess) {
            System.out.println("Your guess is too low!!");
        }
        if (ageEntered
                > ageToGuess) {
            System.out.println("Your guess is too high!!");
        }
    }

    public static void savePlayersListToFile(List<Player> playerList, String path){
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File(path)))) {
            oos.writeObject(playerList);
            System.out.println("All players from input list saved into the file!");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static ArrayList<Player> readPlayersFromFile(String filePath) {
        ArrayList<Player> players = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File(filePath)))) {
            players = (ArrayList<Player>) ois.readObject();
            System.out.println("Succes reading the file; " + filePath);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return players;
    }

        public static void savePlayerToFile(Player player, String filePath) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath))) {
            oos.writeObject(player);
            System.out.println("Player saved to a file!");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static Player readPlayerFromFile(String filePath) {
        Player player = null;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File(filePath)))) {
            player = (Player) ois.readObject();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return player;
    }
}