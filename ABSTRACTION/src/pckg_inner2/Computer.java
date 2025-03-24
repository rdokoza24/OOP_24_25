package pckg_inner2;

public class Computer {

    private String brand;
    protected Processor processor;
    private RAM ram;

    public Computer(String brand, String processorModel, double processorFreq, int SystemMemCapacity){
        this.brand = brand;
        this.processor = new Processor(processorModel, processorFreq);
        this.ram = new RAM(SystemMemCapacity);
    }

    class Processor{

        String processorModel;
        double processorFreq;

        public Processor(String model, double freq){
            this.processorModel = model;
            this.processorFreq = freq;
        }

        public void bootOS(){
            System.out.println("Processor: " + processorModel + " is booting OS in computer: " + brand);
        }
    }

    static class RAM{
        int capacity;

        public RAM(int cap){
            this.capacity = cap;
        }

        public void testSystemRAM(){
            System.out.println("This comp has RAM capacity: " + capacity + "GB");
        }
    }

    public void checkCompTemp(){
        class TemperatureSensor{
            private double temp;
            private static final double MAXT = 120.0;
            private static final double MINT = 20.0;

            public void checkTemperature(){
                this.temp = MINT + Math.random()*(MAXT-MINT);
            }

            public double getTemp(){
                return temp;
            }
        }

        TemperatureSensor sensor = new TemperatureSensor();
        sensor.checkTemperature();
        System.out.println("Temperature for comp: " + brand + " is: " + sensor.getTemp());
    }

    public void bootComputer(){
        Runnable boot = new Runnable() {
            @Override
            public void run(){
                processor.bootOS();
                ram.testSystemRAM();
                checkCompTemp();
            }
        };

        new Thread(boot).start();
    }
    public void powerOnSelfTest(){
        TestComputer test = new TestComputer(){
            @Override
            public void runTest(){
                processor.bootOS();
                ram.testSystemRAM();
                System.out.println("Checking other hardware resources...");
            }
        };
    }
}
