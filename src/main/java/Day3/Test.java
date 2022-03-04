package Day3;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        ImmuClass a = new ImmuClass("Leo", 123);
    }
}

final class ImmuClass {
    private final String name;
    private final int id;
    private final HashMap<Integer, Integer> map;

    ImmuClass(String name, int id) {
        this.name = name;
        this.id = id;
        map = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public HashMap<Integer, Integer> getMap() {
        HashMap<Integer, Integer> newMap = new HashMap<>();
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            newMap.put(entry.getKey(), entry.getValue());
        }
        return newMap;
    }
}