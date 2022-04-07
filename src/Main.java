import java.util.*;

public class Main {

    public static void main(String[] args) {

        ChairMap personMap = new ChairMap();  //Announcement Our Map
        Person pKey = null;
        //Multidimensional map: Our collection holds information about pet owners, each of whom may have several pets
        personMap.put(new Person("Vassa"), Arrays.asList(new Cat("Barsick"), new Cat("Pupsik")));
        personMap.put(new Person("Mary"), Arrays.asList(new Cat("Tady"), new Dog("Bob")));
        personMap.put(new Person("Ivan"), Arrays.asList(new Cat("Liam"), new Dog("Sas"), new Parrot("Arra")));

        //Show us our Map
        System.out.println("personMap: " + personMap);

        //Method toString()
        System.out.println("personMap.toString(): " + personMap.toString());

        //Method keySet()
        System.out.println("personMap.keySet(): " + personMap.keySet());

        //Method get() - look void method "loopPetValue"
        loopPersonKey(personMap);
        /*for (Person p1 : personMap.keySet()) {
            System.out.println(p1.nam + " has");
            for (Pet pet : personMap.get(p1)) {
                System.out.println("  " + pet + "  " + pet.namePet);
            }
        }*/

        //Method size()
        System.out.println("Method size: " + personMap.size());

        List arrPeople = new ArrayList();
        for (Person p : personMap.keySet()) {
            arrPeople.add(p); //Array keys of our Map. It's added for testing method remove()
            System.out.println("Method contains: " + p.nam + " " + personMap.containsKey(p));
        }

        pKey = (Person) arrPeople.get(0); //Generating key for method remove()

        //Method remove
        personMap.remove(pKey);
        System.out.println("Removed element Mary - " + pKey.nam);
        System.out.println("Now our Map contains: ");

        //Show current state of our Mep - without element Mary
        loopPersonKey(personMap);
        /*for (Person p1 : personMap.keySet()) {
            System.out.println(p1.nam + " has");
            for (Pet pet : personMap.get(p1)) {
                System.out.println("  " + pet + "  " + pet.namePet);
            }
        }*/

        //Method isEmpty() - false
        System.out.println("Is Map Empty?: " + personMap.isEmpty());

        //Method isEmpty()
        System.out.println("This is our keys: " + personMap.keysToArray());

        //Method clear()
        personMap.clear();

        //Method isEmpty() - true
        System.out.println("Map is Empty after clear: " + personMap.isEmpty());

    }
    public static void loopPersonKey (ChairMap persMap) {
        for (Person p : persMap.keySet()) {
            System.out.println(p.nam + " has");
            loopPetValue(persMap, p);
            }
        }


    public static void loopPetValue (ChairMap persMap, Person p){
        for (Pet pet : persMap.get(p)) {
            System.out.println("  " + pet + "  " + pet.namePet);
        }
    }
}



