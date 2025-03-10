package pckg_uml;

public class TestComposition {
    public static void main(String[] args) {
        Car car = new Car("Audi","rs7");
        System.out.println(car);
        car.setMechanic(new Mechanic("Mrle garage"));
        car.serviceCar();
    }
}
