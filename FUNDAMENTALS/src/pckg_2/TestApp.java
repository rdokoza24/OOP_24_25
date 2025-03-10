package pckg_2;

public class TestApp {
    public static void main(String[] args) {
        Car car= new Car("BMW","M5");
        car.carObjectInfo();
        System.out.println(car);
        car.setFailedToStart();
        car.carObjectInfo();
        System.out.println(car);
        car = car.repairCar(new ServiceMan(100));
        car.carObjectInfo();
        System.out.println(car);
        Car sndCar = new Car("Toyota","y3", "2020", "blue");
    }
}
