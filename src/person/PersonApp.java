package person;

import java.util.*;

public class PersonApp {

    public static void main(String[] args) {

        Person max = new Person("Max", "Meyer", 35);
        Person moritz = new Person("Moritz", "Meyer", 15);
        Person anna = new Person("Anna", "Meyer", 56);
        Person eva = new Person("Eva", "Meyer", 25);

        // List (ArrayList), Set (HashSet) keine Duplikate, Map (HashMap)
        ArrayList<Person> personListe = new ArrayList<>();
        personListe.add(max);
        personListe.add(moritz);
        personListe.add(anna);
        personListe.add(eva);
        personListe.add(max); // Duplikat ist erlaubt

//        printAll(personListe);
        personListe.remove(anna);
//        printAll(personListe);

        // HashSet
        HashSet<Person> personSet = new HashSet<>();
        personSet.add(max);
        personSet.add(moritz);
        personSet.add(anna);
        personSet.add(eva);
        personSet.add(max);

//        printAll(personSet);

        // Map
        Map<String, Person> personMap = new HashMap<>();
        personMap.put(max.getPersonNumber(), max);
        personMap.put(moritz.getPersonNumber(), moritz);
        personMap.put(anna.getPersonNumber(), anna);
        personMap.put(eva.getPersonNumber(), eva);

        Person foundPerson = personMap.get(moritz.getPersonNumber());

        printAll(personMap.values());
    }

    public static void printAll(Collection<Person> liste) {
        for (Person person : liste) {
            System.out.println(person);
        }
    }

}
