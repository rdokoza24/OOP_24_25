package pckg_1;

public class Student {
    private String name;
    private int year;
    private String studij;
    private String sveuciliste;

    public Student(String name, int year, String studij, String sveuciliste) {
        this.name = name;
        this.year = year;
        this.studij = studij;
        this.sveuciliste = sveuciliste;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getStudij() {
        return studij;
    }

    public void setStudij(String studij) {
        this.studij = studij;
    }

    public String getSveuciliste() {
        return sveuciliste;
    }

    public void setSveuciliste(String sveuciliste) {
        this.sveuciliste = sveuciliste;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", studij='" + studij + '\'' +
                ", sveuciliste='" + sveuciliste + '\'' +
                '}';
    }
}
