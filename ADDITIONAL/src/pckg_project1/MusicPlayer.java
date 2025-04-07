package pckg_project1;

import java.util.Arrays;

public class MusicPlayer extends MediaDevice{

    private int currentSong;
    private PlayList playlist;

    protected MusicPlayer(String brand, String model) {
        super(brand, model);
        this.currentSong = 0;
        this.playlist = new PlayList();
    }

    @Override
    protected void initializeBaseMediaDevice() {
        playlist.initSongList(5);
    }

    public void addNewSongToPlaylist(Song song) {
        playlist.addSong(song);
    }

    private class PlayList{

        Song[] songs;
        static final int CAPACITY = 10;

        public PlayList(){
            songs = new Song[CAPACITY];
        }

        public Song[] getSongsFromPlayList(){
            return songs;
        }

        public void addSong(Song song){
            if (checkFreeSlots()>=0){
                songs[checkFreeSlots()] = song;
                System.out.println("Song added to playlist");
            }else{
                System.out.println("Playlist is full");
            }
        }

        private int checkFreeSlots(){
            int idx = 0;
            for(Song song : songs){
                if (song == null){
                    return idx;
                } else {
                    idx++;
                }
            }
            return -1;
        }

        void removeSong(int songIdxPos){
            if(songIdxPos>=0 && songIdxPos<songs.length){
                if(songs[songIdxPos] == null){
                    System.out.println("Nothing to remove from this idx");
                }else{
                    songs[songIdxPos] = null;
                    System.out.println("Song from idx: " + songIdxPos + " removed from playlist");
                }
            }
        }

        void initSongList(int numSongs){
            if(numSongs<songs.length){
                for(int k = 0; k < numSongs; k++){
                    songs[k] = new Song("Song"+k, "Artist"+k);
                }
                System.out.println("Playlist initialized!");
            }
        }

        @Override
        public String toString() {
            return "PlayList{" +
                    "songs=" + Arrays.toString(songs) +
                    '}';
        }
    }



    @Override
    public void play() {
        System.out.println("Playing: " + currentSong);
    }

    @Override
    public void pause() {
        System.out.println("Pausing: " + currentSong);
    }

    @Override
    public void stop() {
        System.out.println("Stopping the playlist on: " +this.getClass().getSimpleName());
    }

    @Override
    public void next() {
        if(currentSong == playlist.getSongsFromPlayList().length -1){
            System.out.println("Going to the first song!");
        } else {
            this.currentSong++;
            System.out.println("Current song: " + currentSong);
        }
    }

    @Override
    public void prev() {
        if(currentSong == 0){
            this.currentSong = playlist.getSongsFromPlayList().length - 1;
            System.out.println("Going to the last song!");
        } else {
            this.currentSong--;
            System.out.println("Current song: " + currentSong);
        }
    }

    @Override
    public String toString() {
        return "MusicPlayer{" +
                "currentSong=" + currentSong +
                ", playlist=" + playlist +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
