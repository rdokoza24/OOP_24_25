package pckg_trd;

public class Person implements Comparable<Person> {
    @Override
    public int compareTo(Person other) {
        return this.name.length() - other.name.length();
    }

    private String name;
    private int id;
    private static int idCnt = 10;

    public Person(String name){
        this.name = name;
        this.id = idCnt++;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }


}
