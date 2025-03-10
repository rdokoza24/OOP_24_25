package pckg_4;

import java.util.Date;

public abstract class Vehicle {

    protected String brand;
    protected String model;
    protected Date productionDate;

    private static int ctdIDVeh = 10;
    private int vehId;
    private static final String DatePattern = "dd/MM/yyyy";

    protected Vehicle(String model){
        this.model = model;
        this.vehId = ctdIDVeh++;
    }
    protected Vehicle(String model, String brand){
        this.model = model;
        this.brand = brand;
        this.vehId = ctdIDVeh++;
    }
    public void start(){
        System.out.println("Starting Vehicle" + this.getClass().getSimpleName());
    }
    public void stop(){
        System.out.println("Stoping Vehicle" + this.getClass().getSimpleName());
    }
    protected abstract void info();
}
