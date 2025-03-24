package pckg_polymorph;

public class RubberHorse extends Animal{

    @Override
    public void makeSomeSound(int soundVolume) {
        System.out.println("Rubber toy animals can not produce sound");
        System.out.println("Sound volume is not useful...");
    }

    @Override
    public String toString() {
        return "RubberHorse";
    }
}
