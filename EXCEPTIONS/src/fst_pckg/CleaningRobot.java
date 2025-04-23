package fst_pckg;

public class CleaningRobot extends Robot {

    private int cleaningHours;

    public CleaningRobot(String name) {
        super(name);
        this.cleaningHours = 5;
    }

    @Override
    public void performTask() {
        if (cleaningHours <= 0) {
            System.out.println("Cleaning robot " + name + " has no hours left");
        } else {
            System.out.println("Cleaning robot " + name + " is cleaning...");
        }
    }

    public void chargeRobot() {
        System.out.println("Cleaning robot " + name + " is charging...");
        cleaningHours = 5;
    }
}