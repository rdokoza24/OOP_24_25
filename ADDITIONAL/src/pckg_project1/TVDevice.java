package pckg_project1;

public class TVDevice extends MediaDevice {

    private String currentChannel;
    private static final int MAXCH = 999;


    protected TVDevice(String brand, String model) {
        super(brand, model);
        this.currentChannel = "1";
    }

    @Override
    protected void initializeBaseMediaDevice() {
        System.out.println("TV Device Initialized!");
        System.out.println("Current Channel: " + currentChannel);
    }

    @Override
    public void play() {
        System.out.println("Playing on the channel: " + currentChannel);
    }

    @Override
    public void pause() {
        System.out.println("Pausing the program - automatically run the recorder...");
    }

    @Override
    public void stop() {
        System.out.println("Turning off the TV Device!");
    }

    @Override
    public void next() {
        if(Integer.parseInt(currentChannel) == MAXCH){
            this.currentChannel = "1";
            System.out.println("Going back to the channel: 1");
        } else {
            this.currentChannel = String.valueOf(Integer.parseInt(currentChannel) + 1);
            System.out.println("The next channel is: " + currentChannel);
        }
    }

    @Override
    public void prev() {
        if(Integer.parseInt(currentChannel) == 1){
            this.currentChannel = String.valueOf(MAXCH);
            System.out.println("Previous channel is: " + currentChannel);
        } else {
            this.currentChannel = String.valueOf(Integer.parseInt(currentChannel) - 1);
            System.out.println("Previous channel is: " + currentChannel);
        }
    }

    @Override
    public String toString() {
        return "TVDevice{" +
                "currentChannel='" + currentChannel + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}