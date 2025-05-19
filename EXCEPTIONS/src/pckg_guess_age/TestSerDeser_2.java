package pckg_guess_age;

import java.util.ArrayList;

public class TestSerDeser_2 {
    public static void main(String[] args) {
        ArrayList<Player> players = new ArrayList<>();
        populatePlayers(players, 5);
        listAllPlayers(players);
        String pathToPlayers = "players_arr_list.bin";
        AUX_CLS.savePlayersListToFile(players, pathToPlayers);
        ArrayList<Player> playersNew = AUX_CLS.readPlayersFromFile(pathToPlayers);
        listAllPlayers(playersNew);
    }

    private static void populatePlayers(ArrayList<Player> players, int numPlayers){
        for (int i = 0; i<numPlayers; i++){
            Player player = new Player(new Person("Player-"+i), "GamePlayerName_"+i);
            players.add(player);
        }
        System.out.println("All players added to a list!");
    }


    private static void listAllPlayers(ArrayList<Player> players){
        System.out.println("\n-------------------------------------------");
        System.out.println(Integer.toHexString(players.hashCode()));
        for (Player player : players){
            System.out.println(player);
        }
    }
}
