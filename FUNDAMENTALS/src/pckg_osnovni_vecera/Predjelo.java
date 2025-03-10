package pckg_osnovni_vecera;

public class Predjelo {

    private String nazivPredjela;
    private double cijena;

    public Predjelo(String nazivPredjela, double cijena) {
        this.nazivPredjela = nazivPredjela;
        this.cijena = cijena;
    }

    @Override
    public String toString() {
        return "Predjelo{" +
                "nazivPredjela='" + nazivPredjela + '\'' +
                ", cijena=" + cijena +
                '}';
    }

    String zadovoljstvoPredjelo() {
        return "Super brajo";
    }

    public double getPrice() {
        return this.cijena;
    }
}
