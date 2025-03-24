package pckg_inner2;

public class AppTest {
    public static void main(String[] args) {
        Computer comp = new Computer("Intel", "Intel i5",3.5,32);
//        Computer.Processor processor = comp. new Processor("Intel i5", 4.5);
//        processor.bootOS();
//        Computer.RAM ram = new Computer.RAM(64);
//        ram.testSystemRAM();
        comp.checkCompTemp();
        comp.bootComputer();
    }
}
