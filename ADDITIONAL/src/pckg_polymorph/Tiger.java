package pckg_polymorph;

public class Tiger extends Animal {

    @Override
    public void makeSomeSound(int soundVolume) {
        System.out.println("Making some specific sound for a tiger. It is very loud...");
        System.out.println("Volume: " + soundVolume);
    }

    @Override
    public String toString() {
        return "Tiger";
    }
}
