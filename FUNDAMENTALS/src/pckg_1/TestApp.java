package pckg_1;

import java.util.Arrays;
import java.util.Scanner;

public class TestApp {

    private static int MINI = 0;
    private static int MAXI = 150;
    private static Scanner scanner;

    public static void main(String[] args) {
        int[][] twoDArray = generate2DArray(4,3);
        printByRowsArray(twoDArray);
        print2DArray(twoDArray);
//        System.out.println(twoDArray);
//        print2DArray(twoDArray);
//        int userInput = userDefinedInput();
//        System.out.println(userInput);
//        boolean inArray = inputIn2DArray(twoDArray, userInput);
//        System.out.println("In array: " + inArray);
        inputUntilGuess(twoDArray);
    }

    private static void inputUntilGuess(int[][] array){
        int userInput = userDefinedInput();
        while(!inputIn2DArray(array, userInput)){
            userInput = userDefinedInput();
        }
        System.out.println("Terminated looping - user successfully guessed!");
    }

    private static int userDefinedInput(){
        scanner = new Scanner(System.in);
        System.out.println("Please enter a number between 0 and 150:\n");
        int value = scanner.nextInt();
//        System.out.println("Closing the scanner...");
//        scanner.close();
        return value;
    }

    private static boolean inputIn2DArray(int[][] array, int userInput){
        for(int k = 0; k < array.length; k++){
            for(int q = 0; q <array[k].length; q++){
                if(array[k][q] == userInput){
                    System.out.println("Found user input in the array!");
                    return true;
                }
            }
        }
        return false;
    }

    private static int[][] generate2DArray(int numRows, int numColumns) {

        int[][] array = new int[numRows][numColumns];

        for (int k = 0; k < numRows; k++) {
            for (int q = 0; q < numColumns; q++) {
                array[k][q] = (int) (MINI + (Math.random()*(MAXI-MINI)));
            }
        }
        return array;
    }

    private static void print2DArray(int[][]array) {
        for (int k = 0; k < array.length; k++) {
            for (int q = 0; q < array[k].length; q++) {
                System.out.print(array[k][q] + "\t");
            }
            System.out.println();
        }
    }
    private static void printByRowsArray(int[][] array){
        for (int[] row : array) {
            System.out.println(Arrays.toString(row));
        }
    }
}
