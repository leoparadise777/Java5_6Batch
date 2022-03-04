package Day7;

import java.util.*;

public class LC146_LRUCache {

    public static void main(String[] args) {
        LRUCache c1 = new LRUCache(2);
        c1.put(1, 1);
        c1.put(2, 2);
        System.out.println(c1.get(1));
        c1.put(3, 3);
        c1.put(3, 3);
        System.out.println(c1.get(2));
        c1.put(4, 4);
        System.out.println(c1.get(1));
        System.out.println(c1.get(3));
        System.out.println(c1.get(4));

        Map<Integer, Integer> lhm = new LinkedHashMap<>();
        lhm.put(1, 1);
        lhm.put(2, 2);
        System.out.println(lhm);
        int res = lhm.get(2);
        System.out.println(res);
        System.out.println(lhm);




    }
    private static void mRecent(int key, Map<Integer, Integer> m) {
        int temp=m.get(key);
        m.remove(key);
        m.put(key,temp);
    }



}
