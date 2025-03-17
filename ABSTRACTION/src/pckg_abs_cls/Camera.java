package pckg_abs_cls;

public class Camera extends Device{

    private final String focus;

    public Camera(String brand, String model){
        this.focus = "Automatic";
        this.brand = brand;
        this.model = model;
    }

    public Camera(String brand, String model, String focus) {
        this.brand = brand;
        this.model = model;
        this.focus = focus;
    }



    @Override
    protected void recordingPictures() {
        System.out.println("Recording Pictures");
    }

    @Override
    protected void recordingVideo() {
        System.out.println("Recording Video");
    }
}
