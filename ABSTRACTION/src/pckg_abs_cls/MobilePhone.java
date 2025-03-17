package pckg_abs_cls;

public class MobilePhone extends Device implements InternetFunctionality {



    public MobilePhone(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }
    @Override
    protected void recordingPictures() {
        System.out.println("Mobile Phone can record pictures");
    }

    @Override
    protected void recordingVideo() {
        System.out.println("Mobile Phone can record video");
    }

    @Override
    public void saveToCloud() {
        System.out.println("Saving to cloud - " +getClass().getSimpleName());
    }

    @Override
    public void surfTheNet() {
        System.out.println("Finding sometihng on Internet- "+getClass().getSimpleName());
    }

    @Override
    public void performChatGPTReaserch() {
        System.out.println(getClass().getSimpleName() + " have app for chatGPT");
    }
}
