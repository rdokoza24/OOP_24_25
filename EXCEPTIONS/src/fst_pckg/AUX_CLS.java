package fst_pckg;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class AUX_CLS {

    public static void readTxtFile(String filePath) {
        try(BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while((line = br.readLine()) != null){
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error reading file: " + e.getMessage());
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("This will be printed no matter what happens");
        }
    }
}