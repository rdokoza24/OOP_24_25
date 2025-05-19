package pckg_guess_age;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;

public class Player implements Serializable {

    private Person person;
    private String playerName;
    private HashMap<Integer, ArrayList<Integer>> gameStats;

    public Player(Person person, String playerName) {
        this.person = person;
        this.playerName = playerName;
        this.gameStats = new HashMap<>();
    }

    public void addGameResults(ArrayList<Integer> guessGameRes){
        int actualKey = gameStats.size();
        gameStats.put(actualKey+1, guessGameRes);
        System.out.println("New guess game results added for this player!");
    }

    public void seeGameResults(){
        for(Integer gameId : gameStats.keySet()){
            System.out.println(gameId + " results: " + gameStats.get(gameId));
        }
    }


    public void gameInfo(){
        System.out.println("Total games played by player: " + gameStats.size());
    }

    @Override
    public String toString() {
        return "Player{" +
                "person=" + person +
                ", playerName='" + playerName + '\'' +
                ", gameStats=" + gameStats +
                '}';
    }
}
