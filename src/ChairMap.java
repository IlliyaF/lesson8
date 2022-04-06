import java.util.*;


public class ChairMap implements InterChairMap {

    Map <Person, List <? extends Pet>> hsMap = new HashMap<>();


    @Override
    public void clear() {
        hsMap.clear();
    }

    public boolean containsKey(Person key) {

        return hsMap.containsKey(key);
    }

    @Override
    public List<? extends Pet> get(Person key) {

        List<? extends Pet> pets = hsMap.get(key); return pets;
    }

    @Override
    public boolean isEmpty() {

        return hsMap.isEmpty();
    }

    public List<? extends Pet> remove(Person key) {
        return hsMap.remove(key);
    }

    @Override
    public List put(Person key, List value) {
        return hsMap.put(key, value);
    }


    @Override
    public int size() {
        return hsMap.size();
    }

    @Override
    public Set<Person> keySet() {
        return hsMap.keySet();
    }

    @Override
    public Object[] keysToArray() {

        return hsMap.keySet().toArray();
    }



    @Override
    public String toString() {
        return "ChairMap{" +
                "hsMap=" + hsMap +
                '}';
    }


}