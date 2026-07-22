package dsa;

class Sol {

    static int minSwapsToGroupOnes(int[] arr) {
        int ones = 0;

        for (int i : arr) {
            if (i == 1) {
                ones++;
            }
        }

        // Edge case: if there are no 1s, return -1
        if (ones == 0) {
            return -1;
        }

        int currentOne = 0;
        for (int i = 0; i < ones; i++) {
            if (arr[i] == 1) {
                currentOne++;
            }
        }

        // TRACK MAX: Start with the count from the first window
        int maxOnes = currentOne;

        for (int i = ones; i < arr.length; i++) {
            // 1. Add incoming element
            if (arr[i] == 1) {
                currentOne++;
            }

            // 2. Remove outgoing element (FIX)
            
            if (arr[i - ones] == 1) {
                currentOne--;
            }

            // 3. Update the maximum 1s found in any window (FIX)
            maxOnes = Math.max(maxOnes, currentOne);
        }

        // 4. Return total window size minus max 1s found (FIX)
        return ones - maxOnes;
    }
}

public class MInSwap {

    public static void main(String[] args) {
        int[] arr = {1, 0, 1, 0, 1};
        System.out.print("minimum swap required is --> " + "   " + Sol.minSwapsToGroupOnes(arr));
    }
}
