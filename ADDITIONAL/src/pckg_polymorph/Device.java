package pckg_polymorph;

public class Device {

    public Device(){
        System.out.println("This is from device: " + this.getClass().getSimpleName());
    }

    public void powerOn(){
        System.out.println("Turning on...");
    }
}
