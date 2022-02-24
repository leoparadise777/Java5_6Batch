package Day2;

import java.util.*;

public class Assignment1_15 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 7, 9, 9, 4, 6};
        System.out.println(sndLargeNum(arr));
    }

    public static int sndLargeNum(int[] arr){
        Set<Integer> s = new TreeSet<>();
        for(int i = 0; i < arr.length; i++){
            s.add(arr[i]);
        }
        List<Integer> ls = new ArrayList<>(s);
        return ls.get(ls.size() - 2);
    }
}
