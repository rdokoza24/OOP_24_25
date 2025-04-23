package fst_pckg;

public class FlyingRobot extends Robot {

    private int flyingHours;

    public FlyingRobot(String name) {
        super(name);
        this.flyingHours = 3;
    }

    @Override
    public void performTask() {
        if(flyingHours <= 0){
            System.out.println("FlyingRobot " + name + " has no flying hours left.");
        } else {
            System.out.println("FlyingRobot " + name + " is flying");
            flyingHours--;
        }

    }

    @Override
    public void chargeRobot() {
        System.out.println("This one is using fuelRobot method!");
        fuelRobot();
    }

    public void fuelRobot(){
        System.out.println("Fueling Robot " + name + " is charging...");
        flyingHours = 3;
    }
}
