package pckg_osnovni_vecera;


import pckg_outsource_vecera.Desert;
import pckg_outsource_vecera.GlavnoJelo;

public class AppTest {
    public static void main(String[] args) {
        Predjelo predjelo = new Predjelo("Juha od gljiva",4.5);
        GlavnoJelo glavnoJelo = new GlavnoJelo("Bravetna na lešo", 10.50);
        Desert desert = new Desert("Lavakejk brajo", 5);
        Vecera vecera = new Vecera(predjelo, glavnoJelo, desert);
        double cijena = vecera.finalPrice();
        System.out.println(vecera);
        System.out.println("Plati " +cijena +" pa se rugaj");
    }
}
