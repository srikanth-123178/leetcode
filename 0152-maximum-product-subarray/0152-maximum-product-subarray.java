class Solution {
    public int maxProduct(int[] nums) {
        // Step 1: handle single element array
        if (nums.length == 1) {
            return nums[0];
        }

        // Step 2: initialize current max, current min, and result
        int currMax = nums[0];   // max product ending at current index
        int currMin = nums[0];   // min product ending at current index (needed for negative numbers)
        int result = nums[0];    // overall maximum product

        // Step 3: loop through array from index 1
        for (int i = 1; i < nums.length; i++) {
            int temp = currMax;

            // Step 4: update currMax and currMin
            currMax = Math.max(nums[i], Math.max(currMax * nums[i], currMin * nums[i]));
            currMin = Math.min(nums[i], Math.min(temp * nums[i], currMin * nums[i]));

            // Step 5: update overall result
            result = Math.max(result, currMax);
        }

        return result;
    }
}
