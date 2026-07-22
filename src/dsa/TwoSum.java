package dsa;

import java.util.*;

class TSol {

    static int[] twoSum(int[] arr, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {

            int complement = target - arr[i];

            if (map.containsKey(complement)) {

                return new int[]{map.get(complement), i};
            }

            map.put(arr[i], i);
        }

        return new int[]{-1, -1};
    }
}

public class TwoSum {

    public static void main(String args[]) {
        int[] arr = {9, 2, 7, 4};
        int[] ans = TSol.twoSum(arr, 11);
        for (int i = 0; i < ans.length; i++) {

            System.out.print(ans[i] + " ");
        }
    }
}
