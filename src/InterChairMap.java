
import java.util.List;
import java.util.Set;

public interface InterChairMap {

    void clear();

    boolean containsKey(Person key);

    List get(Person key);

    boolean isEmpty();

    List remove(Person key);

    List put(Person key, List value);

    int size();

    Set<Person> keySet();

    Object[] keysToArray();




}
