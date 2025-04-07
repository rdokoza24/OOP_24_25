package pckg_project1;

public class Song {

    private String songName;
    private String artist;

    public Song(String songName, String artist){
        this.artist = artist;
        this.songName = songName;
    }

    @Override
    public String toString() {
        return "Song{" +
                "songName='" + songName + '\'' +
                ", artist='" + artist + '\'' +
                '}';
    }
}
