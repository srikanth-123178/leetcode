class Solution {
    public int missingNumber(int[] nums) {
        int x=0;
        Arrays.sort(nums);
        for (int i=0;i<nums.length;i++){
            if (nums[i]==x){
                x++;
            }
        }
        return x;
    }
}