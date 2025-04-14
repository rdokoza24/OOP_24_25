package pckg_snd;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class AUX_CLS {

    private static Scanner scanner;

    public static void readFromFile(String filePath){
        Path path = Paths.get(filePath);
        try{
            Scanner scanner = new Scanner(path);
            while(scanner.hasNext()){
                System.out.println(scanner.nextLine());
            }
        } catch (IOException ioe) {
            System.out.println(ioe.fillInStackTrace());
        }
    }

    public static ArrayList<String[]> readQuotes(String filePath){
        Path path = Paths.get(filePath);
        ArrayList<String[]> quotes = new ArrayList<>();
        try{
            scanner = new Scanner(path);
            while(scanner.hasNext()){
                String line = scanner.nextLine();
                String[] parts = line.split("-");
                quotes.add(parts);
            }
        } catch (IOException ioe) {
            System.out.println(ioe.fillInStackTrace());
        }
        return quotes;
    }

    public static void listArrayListElements(ArrayList<String[]> quotes){
        for(String[] element: quotes){
            System.out.println(Arrays.toString(element));
        }
    }

    public static HashMap<String, ArrayList<String>> linkAuthorAndQuotes(ArrayList<String[]> quotes){
        HashMap<String, ArrayList<String>> authorQuotes = new HashMap<>();
        for(String[] data: quotes){
            String author = data[0].strip();
            String quote = data[1].strip();
            addNewQuote(author, quote, authorQuotes);
        }
        return authorQuotes;
    }

    public static void readAuthorAndQuotes(HashMap<String,ArrayList<String>> aQuotes){
        for(String author: aQuotes.keySet()){
            System.out.println("Author: " + author);
            for (String quote: aQuotes.get(author)){
                System.out.println(quote);
            }
            System.out.println("--------------------------------");
        }
    }

    public static void addNewQuote(String author, String quote, HashMap<String, ArrayList<String>> aQuotes){
        if (aQuotes.containsKey(author)){
            aQuotes.get(author).add(quote);
            System.out.println("New quote added for author: " + author);
        } else {
            ArrayList<String> quotes = new ArrayList<>();
            quotes.add(quote);
            aQuotes.put(author, quotes);
            System.out.println("New quote added for author: " + author);
        }
    }

    public static void writeQuotesToFile(String filePath, HashMap<String, ArrayList<String>> aQuotes){
        Path path = Paths.get(filePath);
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(new File(filePath)))){
            for (String author : aQuotes.keySet()) {
                bw.write("Author: "+author);
                bw.newLine();
                for (String quote : aQuotes.get(author)) {
                    bw.write(quote);
                }
                bw.write("\n--------------------------------\n");
            }
        } catch (IOException ioe) {
            System.out.println(ioe.fillInStackTrace());
        }
        System.out.println("Quotes saved to file: " + filePath);
    }

    public static void quoteAndAuthorCounter(HashMap<String, ArrayList<String>> aQuotes){
        for (String author: aQuotes.keySet()) {
                System.out.println("Author: " + author + " has: " + aQuotes.get(author).size() + " quotes");
        }
    }
}
