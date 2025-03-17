package pckg_inner;

public class TestCLS {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle() {

            @Override
            public void startEngine() {
                System.out.println("Starting engine");
            }

            @Override
            public void stopEngine() {
                System.out.println("Stopping engine");
            }
        };
    }
}
