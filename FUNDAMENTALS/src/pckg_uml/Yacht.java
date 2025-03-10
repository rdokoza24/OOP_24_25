package pckg_uml;

public class Yacht extends Boat implements Turbo{
    @Override
    public void run() {
        System.out.println("Specific way of cruising on the water in the Yacht");
    }

    @Override
    public void gotToTurboMode() {
        System.out.println("Sailing in the turbo mode");
    }
}
