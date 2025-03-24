package pckg_project1;

public class MusicPlayer extends MediaDevice{

    private int currentSong;
    private PlayList playlist;

    protected MusicPlayer(String brand, String model) {
        super(brand, model);
        this.currentSong = 0;
        this.playlist = new PlayList();
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
    }

    @Override
    public void turnOnDevice() {

    }

    @Override
    public void play() {

    }

    @Override
    public void pause() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void next() {

    }

    @Override
    public void prev() {

    }
}
