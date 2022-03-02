package Day7;

import java.util.*;

public class LRUCache {
    int cap;
    LinkedHashMap<Integer, Integer> cache = new LinkedHashMap<>();

    public LRUCache(int capacity) {
        this.cap = capacity;
    }

    public int get(int key) {
        int res;
        if(!cache.containsKey(key)){
            return -1;
        }else{
            res=cache.get(key);
            makeRecent(key);
        }
        return res;
    }

    public void put(int key, int value) {
        cache.put(key,value);
        makeRecent(key);
        if(cache.size()>cap){
            int oldest=cache.keySet().iterator().next();
            cache.remove(oldest);
        }
    }


    void makeRecent(int key) {
        int temp=cache.get(key);
        cache.remove(key);
        cache.put(key,temp);
    }

}
