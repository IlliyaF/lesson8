import java.util.HashMap;
import java.util.Map;

public class ChairMap implements InterChairMap {

    Map hsMap = new HashMap();


    @Override
    public void clear() {
        hsMap.clear();
    }

    @Override
    public boolean containsKey(Object key) {

        return hsMap.containsKey(key);
    }

    @Override
    public Object get(Object key) {

        return hsMap.get(key);
    }

    @Override
    public boolean isEmpty() {

        return hsMap.isEmpty();
    }

    @Override
    public Object remove(Object key) {

        return hsMap.remove(key);
    }

    @Override
    public Object put(Object key, Object value) {

        return hsMap.put(key, value);
    }

    @Override
    public int size() {
        return hsMap.size();
    }

    @Override
    public String toString() {
        return "ChairMap{" +
                "hsMap=" + hsMap +
                '}';
    }
    //@Override
    //public Entry[] toArray() {
     //   return new Entry[0];
    //}
}
