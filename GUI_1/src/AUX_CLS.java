import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class AUX_CLS {

    public static void saveToBinFile(List<String> viewPanelData, String filePath) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File(filePath)))) {
            oos.writeObject(viewPanelData);
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Can't write to file");
        }
    }

    public static ArrayList<String> loadFromBinFile(String filePath) {
        ArrayList<String> bindata = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File(filePath)))) {
            bindata = (ArrayList<String>) ois.readObject();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        return bindata;
    }
}
