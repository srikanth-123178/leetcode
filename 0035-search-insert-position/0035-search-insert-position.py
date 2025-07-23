class Solution:
    def searchInsert(self, nums: List[int], target: int) -> int:
        for i in range(0,len(nums)):
            if (nums[i]==target):
                return i
            elif nums[i]>target and nums[i-1]<target:
                return i
        if (nums[0]>=target):
            return 0
            
        return len(nums)
        