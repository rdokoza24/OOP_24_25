package pckg_abs_cls;

public abstract class SpaceShip implements FightMode {

    protected String name;
    protected String firstFlight;

    protected SpaceShip(String name, String firstFlight) {
        this.name = name;
        this.firstFlight = firstFlight;
    }

    protected abstract void performHSpaceJump();

    public void flyFromPlanet(){
        System.out.println(getClass().getSimpleName() + " Flying from the planet.");
    }
}
