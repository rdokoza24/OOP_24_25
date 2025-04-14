package pckg_trd;

import java.util.Stack;

public class TestApp {
    public static void main(String[] args) {
        Stack<Person> stackedPersons = new Stack<Person>();
        stackedPersons.push(new Person("marijan"));
        stackedPersons.push(new Person("franceska"));
        stackedPersons.push(new Person("Vojko"));
        stackedPersons.push(new Person("Zelimir"));
        System.out.println(stackedPersons);
        Person person = stackedPersons.pop();
        System.out.println(person);
        System.out.println(stackedPersons);
        reverseString("Dokoza");
    }

    private static void reverseString(String str) {
        Stack<Character> chars = new Stack<>();
        for (int idx = 0; idx < str.length(); idx++) {
            //System.out.println(str.charAt(idx));
            chars.add(str.charAt(idx));
        }
        System.out.println(chars);
        String reversed = "";
        while (!chars.isEmpty()) {
            Character c = chars.pop();
            reversed += c;
        }
        System.out.println(reversed);
    }
}
