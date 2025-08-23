class Solution:
    def maximumGap(self, nums: List[int]) -> int:
        if (len(nums)==1):
            return 0
        nums.sort()
        maximum=0
        for i in range(len(nums)-1):
            arr=nums[i]
            diff=nums[i+1]-arr
            maximum=max(diff,maximum)

        
        return maximum
        