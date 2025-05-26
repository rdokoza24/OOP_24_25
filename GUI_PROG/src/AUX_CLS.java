import java.io.*;
import java.util.ArrayList;

public class AUX_CLS {

    public static void saveProgrammersInFile(String filePath, ArrayList<Programmer> programmers) {
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File(filePath)))){
            oos.writeObject(programmers);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
