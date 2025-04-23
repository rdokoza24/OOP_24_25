package fst_pckg;

public abstract class Robot {

    private static int cntID = 200;
    protected int id;
    protected String name;

    protected Robot(String name){
        this.id = cntID++;
        this.name = name;
    }

    public abstract void performTask();

    public abstract void chargeRobot();

    @Override
    public String toString() {
        return "Robot{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
