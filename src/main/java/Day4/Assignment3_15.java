package Day4;

import java.util.*;

public class Assignment3_15 {
    public static void main(String[] args) {
        List<Integer> A = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 10));
        Map<String, String> B = new HashMap<>();
        B.put("a", "1");
        B.put("b", "2");
        B.put("c", "10");

        List<Integer> res = new ArrayList<>();
        for(int i : A){
            if(!(B.containsValue(String.valueOf(i)))){
                res.add(i);
            }
        }
        System.out.println(res);
    }
}
