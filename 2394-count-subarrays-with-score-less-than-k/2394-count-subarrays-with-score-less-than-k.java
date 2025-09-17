class Solution {
    public long countSubarrays(int[] nums, long k) {
        long count = 0;
        long sum = 0;   // use long to avoid overflow
        int left = 0, right = 0;

        while (right < nums.length) {
            sum += nums[right];  // expand window

            // shrink window until score < k
            while (sum * (right - left + 1) >= k) {
                sum -= nums[left];
                left++;
            }

            // count valid subarrays ending at 'right'
            count += (right - left + 1);

            right++;
        }
        return count;
    }
}
