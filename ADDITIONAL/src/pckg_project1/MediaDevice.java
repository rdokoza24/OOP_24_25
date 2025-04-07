package pckg_project1;

public abstract class MediaDevice implements Playable {

    protected String brand;
    protected String model;

    protected MediaDevice(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    protected abstract void initializeBaseMediaDevice();

}
