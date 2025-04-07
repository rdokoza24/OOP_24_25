package pckg_fst;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;

public class Simple {

    private static Random random = new Random();

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1000);
        numbers.add(1000);
        numbers.add(1000);
        ArrayList<String> strings = new ArrayList<>();
        listElementsFromList(numbers);
        System.out.println(numbers);
        addElement(numbers);
        System.out.println(numbers);
        listElementsFromList(numbers);
        addElementsToList(strings,numbers);
        System.out.println(strings);
        listElementsFromList(strings);
        System.out.println(numbers);
        HashSet<Integer> unique = returnUnicorns(numbers);
        System.out.println(unique);
    }

    private static void listElements(ArrayList<Integer> lista) {
        for (Integer num : lista) {
            System.out.println(num);
        }
    }

    private static void ListSElements(ArrayList<String> lst){
        for(String el: lst){
            System.out.println(el);
        }
    }

    private static <E> void listElementsFromList(ArrayList<E> lst){
        for(E element: lst){
            System.out.println(element);
        }
    }

    private static void addElement(ArrayList<Integer> lista) {
        for (int i = 0; i < 10; i++) {
            lista.add(ThreadLocalRandom.current().nextInt(-100, 100));
        }
    }

    private static void addElementsToList(ArrayList<String> lst, ArrayList<Integer> nums) {
        for(Integer num: nums){
            lst.add(String.valueOf(num));
        }
    }

    private static void generateNewElement(ArrayList<Integer> lista) {
        for (int i = 0; i < 10; i++) {
            lista.add(random.nextInt(-100, 100));
        }
    }

    private static <E> HashSet returnUnicorns(ArrayList<E> lst){
        HashSet<E> unique = new HashSet<>(lst);
        return unique;
    }

    private static <E> ArrayList returnUnicornsSnd(ArrayList<E> lst){
        ArrayList<E> unique = new ArrayList<>();
        for(E element: lst){
            if(unique.contains(element)){
                System.out.println("Duplicate element");
            } else {
                unique.add(element);
            }
        }
        return unique;
    }
}