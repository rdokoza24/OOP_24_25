package pckg_uml;

public class Boat implements Vehicle {
    @Override
    public void start() {
        System.out.println(this.getClass().getSimpleName()+ " started");
    }

    @Override
    public void stop() {
        System.out.println(this.getClass().getSimpleName()+ " stopped");
    }

    @Override
    public void run() {
        System.out.println("Flowing on the water...");
    }
}
