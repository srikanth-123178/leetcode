class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int sum=0;
        Arrays.sort(nums);
        int sum1=nums[0]+nums[1]+nums[2];
        for (int i=0;i<nums.length-2;i++){
            int left=i+1;
            int right=nums.length-1;
            while (left<right){
                sum=nums[i]+nums[left]+nums[right];
                if (Math.abs(sum-target)<Math.abs(sum1-target)){
                    sum1=sum;
                } 
                if (sum>target){
                    right--;
                } else if (sum<target){
                    left++;
                } else {
                    return sum;
                }
            }
        }
        return sum1;
        
    }
}