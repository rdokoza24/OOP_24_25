package pckg_project1;

public class AppTest {

    public static void main(String[] args) {
        MediaCenter mediaCenter = new MediaCenter(new TVDevice("Sony", "Smart4k"));
        mediaCenter.setMediaDevice(new MusicPlayer("Apple","Mp3"));
        mediaCenter.initMediaDevice();
        mediaCenter.playOnMediaDevice();
        mediaCenter.goToNext();
        mediaCenter.goToNext();
        mediaCenter.goToPrevious();
        mediaCenter.pauseMediaDevice();
        mediaCenter.stopMediaDevice();
        System.out.println(mediaCenter);
    }
}
