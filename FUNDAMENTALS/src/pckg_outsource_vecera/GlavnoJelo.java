package pckg_outsource_vecera;

public class GlavnoJelo {
    private String nazivJela;
    private double cijena;

    public GlavnoJelo(String nazivJela, double cijena) {
        this.nazivJela = nazivJela;
        this.cijena = cijena;
    }

    @Override
    public String toString() {
        return "GlavnoJelo{" +
                "nazivJela='" + nazivJela + '\'' +
                ", cijena=" + cijena +
                '}';
    }

    public double getPrice() {
        return this.cijena;
    }
}
