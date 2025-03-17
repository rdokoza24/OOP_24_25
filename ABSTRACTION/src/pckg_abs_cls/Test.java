package pckg_abs_cls;

public class Test {
    public static void main(String[] args) {
        MobilePhone mp = new MobilePhone("Apple", "16");
        Device camera = new Camera("Cannon", "RS100");
        Device[] devices = {mp, camera};
        testDevices(devices);
        mp.saveToCloud();
        mp.performChatGPTReaserch();
        mp.surfTheNet();
    }
    private static void testDevices(Device[] devices) {
        for(Device device : devices){
            device.chargeDevice();
            device.recordingVideo();
            device.recordingPictures();
        }
    }
}
