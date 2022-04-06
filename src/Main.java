import java.util.*;

public class Main {

    public static void main(String[] args) {

        ChairMap persMap1 = new ChairMap();  //Announcement Our Map

        //Multidimensional map: Our collection holds information about pet owners, each of whom may have several pets
        persMap1.put(new Person("Vassa"), Arrays.asList(new Cat("Barsick"), new Cat("Pupsik")));
        persMap1.put(new Person("Mary"), Arrays.asList(new Cat("Tady"), new Dog("Bob")));
        persMap1.put(new Person("Ivan"), Arrays.asList(new Cat("Liam"), new Dog("Sas"), new Parrot("Arra")));

        //Show us our Map
        System.out.println("personMap: " + persMap1);

        //Method toString()
        System.out.println("personMap.toString(): " + persMap1.toString());

        //Method keySet()
        System.out.println("personMap.keySet(): " + persMap1.keySet());

        for (Person p1 : persMap1.keySet()) {
            System.out.println(p1.nam + " has");
            for (Pet pet : persMap1.get(p1)) {
                System.out.println("  " + pet + "  " + pet.namePet);
            }
        }

        //Method size()
        System.out.println("Method size: " + persMap1.size());

        List arrPeople = new ArrayList();
        for (Person p2 : persMap1.keySet()) {
            arrPeople.add(p2); //Array keys of our Map. It's added for testing method remove()
            System.out.println("Method contains: " + p2.nam + " " + persMap1.containsKey(p2));
        }

        Person p3 = (Person) arrPeople.get(0); //Generating key for method remove()

        //Method remove
        persMap1.remove(p3);
        System.out.println("Removed element Mary - " + p3.nam);
        System.out.println("Now our Map contains: ");

        //Show current state of our Mep - without element Mary
        for (Person p1 : persMap1.keySet()) {
            System.out.println(p1.nam + " has");
            for (Pet pet : persMap1.get(p1)) {
                System.out.println("  " + pet + "  " + pet.namePet);
            }
        }

        //Method isEmpty() - false
        System.out.println("Is Map Empty?: " + persMap1.isEmpty());

        //Method isEmpty()
        System.out.println("This is our keys: " + persMap1.keysToArray());

        //Method clear()
        persMap1.clear();

        //Method isEmpty() - true
        System.out.println("Map is Empty after clear: " + persMap1.isEmpty());

    }



}



