class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int count=1,maxcount=0;
        if (nums.length==1){
            return 1;
        }
        for (int i=1;i<nums.length;i++){
            if (nums[i]>nums[i-1]){
                count++;
            } else {
                count=1;
            }
            maxcount=Math.max(maxcount,count);
        }
   
        return maxcount;
    }
}