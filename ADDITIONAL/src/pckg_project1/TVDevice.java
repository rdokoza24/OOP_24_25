package pckg_project1;

public class TVDevice extends MediaDevice{

    private String currentChannel;
    private static final int MAXCH = 999;


    protected TVDevice(String brand, String model){
        super(brand, model);
        this.currentChannel = "1";
    }

    @Override
    public void turnOnDevice() {
        System.out.println("Turning on TV device...");
    }

    @Override
    public void play() {
        System.out.println("Playing tv on the channel " + currentChannel);
    }

    @Override
    public void pause() {
        System.out.println("Turn on the recorder to record tv program");
    }

    @Override
    public void stop() {
        System.out.println("Stopping in tv is equal to turn off!");
    }

    @Override
    public void next() {
        if (Integer.parseInt(currentChannel) == MAXCH){
            currentChannel = "1";
        } else {
            int next = Integer.parseInt(currentChannel) + 1;
            currentChannel = String.valueOf(next);
        }
    }

    @Override
    public void prev() {
        if (Integer.parseInt(currentChannel) == 1){
            currentChannel = String.valueOf(MAXCH);
        } else {
            int prev = Integer.parseInt(currentChannel) - 1;
            currentChannel = String.valueOf(prev);
        }
    }
}
