package pckg_polymorph;

public class Animal {

    public void makeSomeSound(int soundVolume){
        System.out.println("Making some basic animal sound - volume: " + soundVolume);
    }

    @Override
    public String toString() {
        return "Animal";
    }
}
