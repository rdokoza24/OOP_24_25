package pckg_outsource_vecera;

public class Desert {
    private String nazivDeserta;
    private double cijena;

    public Desert(String nazivJela, double cijena) {
        this.nazivDeserta = nazivJela;
        this.cijena = cijena;
    }
    void pojeoDesert(){
        System.out.println("Pojeo desert");
    }

    public double getPrice() {
        return this.cijena;
    }

    @Override
    public String toString() {
        return "Desert{" +
                "nazivDeserta='" + nazivDeserta + '\'' +
                ", cijena=" + cijena +
                '}';
    }
}
