package pckg_trd;

import java.util.*;

public class Test {

    public static void main(String[] args) {
        List<Person> persons = new LinkedList<>();
        Person person = new Person("Crnac");
        persons.add(person);
        persons.add(person);
        persons.add(new Person("Niko"));
        persons.add(new Person("Roko"));
        persons.add(new Person("Srboljub"));
        persons.add(new Person("Crnac"));
        persons.add(2, new Person("Grgo"));
        System.out.println(persons);
        TreeSet<Person> tpersons = new TreeSet<>(persons);
        System.out.println(tpersons);
        LinkedHashSet<Person> lpersons = new LinkedHashSet<>(persons);
        System.out.println(lpersons);
        HashSet<Person> setPersons = new HashSet<>(persons);
        System.out.println(setPersons);
    }
}
