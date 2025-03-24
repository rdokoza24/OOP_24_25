package pckg_polymorph;

public class Tv extends Device{

    public Tv(){
        System.out.println("This is from TV constructor: " + this.getClass().getSimpleName());
    }

    @Override
    public void powerOn() {
        System.out.println("Turning on with a remote...");
    }

    public void changeChannel(){
        System.out.println("Changing channel using a remote...");
    }
}
