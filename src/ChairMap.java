import java.util.HashMap;
import java.util.Map;

public class ChairMap implements InterChairMap {

    Map hsMap = new HashMap();


    @Override
    public void clear() {
        hsMap.clear();
    }

    @Override
    public boolean containsKey(String key) {
        return false;
    }

    @Override
    public String get(String key) {
        return null;
    }

    @Override
    public boolean isEmpty() {

        return hsMap.isEmpty();
    }

    @Override
    public String remove(String key) {
        return null;
    }

    @Override
    public String put(String key, String value) {
        return null;
    }

    @Override
    public int size() {
        return hsMap.size();
    }

    //@Override
    //public Entry[] toArray() {
     //   return new Entry[0];
    //}
}
