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

    Object remove(Object key);

    Object put(Object key, Object value);

    int size();

   // Entry[] toArray();

}
