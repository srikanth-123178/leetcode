import java.util.*;

class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        int[] result = new int[spells.length];
        int m = potions.length;

        for (int i = 0; i < spells.length; i++) {
            long minPotion = (success + spells[i] - 1) / spells[i]; // ceiling division
            int idx = binarySearch(potions, minPotion);
            result[i] = m - idx;
        }
        return result;
    }

    private int binarySearch(int[] potions, long target) {
        int left = 0, right = potions.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (potions[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left; // first index where potions[idx] >= target
    }
}
