package pckg_bidirectional;

public class CarFactoryTest {
    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory("mercedes");
        Car car = carFactory.produceCar("SLK");
        System.out.println(car);
    }
}
