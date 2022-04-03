public interface InterChairMap {

   /* interface Entry {
        String getKey();
        String getValue();
        void setValue(String value);
    }
*/

    void clear();

    boolean containsKey(Object key);

    Object get(Object key);

    boolean isEmpty();

    Object remove(Object key); // Returns the value to which this map previously associated the key, or null

    Object put(Object key, Object value); // Returns the previous value associated with key, or null

    int size();

   // Entry[] toArray();

}
