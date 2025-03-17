package pckg_abs_cls;

public class SpaceShipClassA extends SpaceShip{

    private long numberOfMissions;

    protected SpaceShipClassA(String name, String firstFlight) {
        super(name, firstFlight);
        this.numberOfMissions = 0;
    }

    @Override
    protected void performHSpaceJump() {
        System.out.println("This space ship class can not make Hspace Jump.");
    }

    @Override
    public String toString() {
        return "SpaceShipClassA{" +
                "numberOfMissions=" + numberOfMissions +
                ", name='" + name + '\'' +
                ", firstFlight='" + firstFlight + '\'' +
                '}';
    }

    @Override
    public void flyFromPlanet() {
        super.flyFromPlanet();
        numberOfMissions++;
    }

    @Override
    public void performAttackWithBlasters() {
        System.out.println("Attacking with Blasters!");
    }

    @Override
    public void performAttackWithPlasmaGun() {
        System.out.println("Attacking with Plasma gun!");
    }
}
