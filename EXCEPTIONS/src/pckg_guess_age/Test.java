package pckg_guess_age;


import java.util.Scanner;

public class Test {

    private static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        Player player = new Player(new Person("Roko"), "PLAYER1");
//        AgeGuessGame.startGame(player);
        playNewGame(player);
        player.seeGameResults();
    }

    public static void playNewGame(Player player){
        boolean play = true;
        while(play){
            AgeGuessGame.startGame(player);
            System.out.println("New game for this player - y for yes, other for no!");
            play = scanner.nextLine().equalsIgnoreCase("y");
        }
        System.out.println("Out of this game block!");
    }
}