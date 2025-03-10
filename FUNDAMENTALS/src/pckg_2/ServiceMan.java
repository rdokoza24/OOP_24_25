package pckg_2;

public class ServiceMan {

    private int id;

    public ServiceMan(int id) {
        this.id = id;
    }
    public Car repairCar(Car car){
        System.out.println(this.id + ": "+this.getClass().getSimpleName()+ " repairing car...");
        return car.repairCar(this);
    }
}
