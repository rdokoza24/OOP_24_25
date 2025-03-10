package pckg_2;

import java.util.Date;

public class Vehicle {

    private String brand;
    private String model;
    private Date year;
    private static int cntID = 200;
    private int vehID;


    public Vehicle(String brand, String model, Date year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.vehID = cntID++;
    }
    public void start(){
        System.out.println();
    }
    public void stop(){

    }
    public String info(){
        return "";
    }
}
