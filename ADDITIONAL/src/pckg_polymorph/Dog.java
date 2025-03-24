package pckg_polymorph;

public class Dog extends Animal {

    @Override
    public void makeSomeSound(int soundVolume) {
        System.out.println("Av Av Av - grrr");
        System.out.println("Volume: " + soundVolume);

    }

    @Override
    public String toString() {
        return "Dog";
    }
}
