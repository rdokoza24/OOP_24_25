package pckg_polymorph;

public class TestDevice {
    public static void main(String[] args) {
        SmartTV smartTV = new SmartTV();
        Tv tv = new Tv();
        tv.powerOn();
        tv.changeChannel();
    }
}
