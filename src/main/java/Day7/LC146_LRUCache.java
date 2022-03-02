package Day7;

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

    }



}
