package tasks.task14;

import java.util.HashMap;
import java.util.Map;

public class CacheClass<K, V> {
    Map<K, V> map = new HashMap<>();
    int maxSize = 0;

    public CacheClass(int maxSize) {
        this.maxSize = maxSize;
        this.map = new HashMap<>();
    }

    public CacheClass() {
        this(100);
    }

    public void put(K key, V value) {
        if (map.size() >= maxSize) {
            map.clear();
        }
        map.put(key, value);
    }

    public V get(K key) {
        return map.get(key);
    }

    public boolean contains(K key) {
        return map.containsKey(key);
    }

    public V remove(K key) {
        return map.remove(key);
    }

    public void clear() {
        map.clear();
    }

    public int size() {
        return map.size();
    }
}
