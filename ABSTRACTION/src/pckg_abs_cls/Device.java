package pckg_abs_cls;

public abstract class Device {

    protected String brand;
    protected String model;

    public void chargeDevice(){
        System.out.println("Charging Device - " + getClass().getSimpleName());
    }

    protected abstract void recordingPictures();
    protected abstract void recordingVideo();


}
