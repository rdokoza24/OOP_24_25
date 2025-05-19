package pckg_guess_age;

public class TestSerDeser {

    public static void main(String[] args) {
//        Player player = new Player(new Person("Marija"),"pro");
//        System.out.println(Integer.toHexString(player.hashCode()));
          String filePath = "player.bin";
//        AUX_CLS.savePlayerToFile(player, filePath);
        Player fromFilePlayer = AUX_CLS.readPlayerFromFile(filePath);
        System.out.println(Integer.toHexString(fromFilePlayer.hashCode()));
    }
}
