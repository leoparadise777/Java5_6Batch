package Day2;

import java.util.*;

public class TreeMapSet {
    public static void main(String[] args) {
        //Set<MSNode> set = new TreeSet<>();
        Set<MSNode> set = new TreeSet<>(new MyComparable());
        set.add(new MSNode(1));
        set.add(new MSNode(2));

        System.out.println(set.size());

    }
}

class MyComparable implements Comparator<MSNode>{

    @Override
    public int compare(MSNode o1, MSNode o2) {
        return o1.key - o2.key;
    }
}

//class MSNode implements Comparable<MSNode>{
class MSNode{
    int key;

    public MSNode(int key) {
        this.key = key;
    }

    /*
    @Override
    public int compareTo(MSNode o) {
        return this.key - o.key; // ascending order
    }
     */
}