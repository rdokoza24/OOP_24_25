package fst_pckg;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class TestApp {
    private static Scanner scanner;

    public static void main(String[] args) throws FileNotFoundException {
        scanner = new Scanner(System.in);
        System.out.println("Please enter one integer number:");
        int number = scanner.nextInt();
        System.out.println("You entered " + number);
        //readTxtFile("src/fst_pckg/robot.txt");
        //readTxtFile2("input.txt");
        AUX_CLS.readTxtFile("input.txt");
    }

    private static void readTxtFile(String filePath) throws FileNotFoundException {
        scanner = new Scanner(new File(filePath));
        String line;
        while(scanner.hasNextLine()) {
            line = scanner.nextLine();
            System.out.println(line);
        }
    }

    private static void readTxtFile2(String filePath){
        Path path = Paths.get(filePath);
        try {
            scanner = new Scanner(path);
            while(scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
        } catch (IOException ioe) {
            System.out.println("There was a problem reading the file with path: " + filePath);
            ioe.printStackTrace();
        }
    }
}
