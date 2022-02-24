package Day2;

import java.util.*;

public class Assignment1_14 {
    public static void main(String[] args) {

        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 3, 4, 5};
        System.out.println(Arrays.toString(mergeIntArray(arr1, arr2)));

    }

    public static int[] mergeIntArray (int[] arr1, int[] arr2){
        int l1 = arr1.length, l2 = arr2.length;
        int[] res = new int[l1 + l2];
        System.arraycopy(arr1, 0, res, 0, l1);
        System.arraycopy(arr2, 0, res, l1, l2);
        return res;
    }
}
