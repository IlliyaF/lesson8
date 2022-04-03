import java.util.*;

public class Main {

    public static void main(String[] args) {
        final List arrChair = new ArrayList();
        Set hsStores = new HashSet<>();
        ChairMap chstMap = new ChairMap();

        Chair chair1 = new Chair(1, "kitchen", "white", "metal", true);
        Chair chair2 = new Chair(2, "office", "black", "plastic", true);
        Chair chair3 = new Chair(3, "flat", "brown", "wood", false);

        Stores store1 = new Stores(1, 1, "02/02/2022", 25, 7);
        Stores store2 = new Stores(2, 3, "11/26/2021", 56, 4);
        Stores store3 = new Stores(3, 2, "03/11/2022", 73, 62);

        arrChair.add(chair1);
        arrChair.add(chair2);
        arrChair.add(chair3);

        hsStores.add(store1);
        hsStores.add(store2);
        hsStores.add(store3);

        System.out.println("Array with chairs: " + arrChair.toString());
        System.out.println("Set of stores: " + hsStores.toString());
        chstMap.put(arrChair, hsStores);
        System.out.println(chstMap.toString());
        System.out.println("Method size: " + chstMap.size());
        System.out.println("Method contains: " + chstMap.containsKey(arrChair));
        System.out.println("Method get: " + chstMap.get(arrChair));
        System.out.println("Method isEmpty: " + chstMap.isEmpty());
        chstMap.clear();
        System.out.println("Method is Empty after clear: " + chstMap.isEmpty());
        chstMap.put(arrChair, hsStores);
        System.out.println("Resurrection Map: " + chstMap.toString());
        chstMap.remove(arrChair);
        System.out.println("Removed element " + arrChair.toString());


    }



}

