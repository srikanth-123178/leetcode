class Solution:
    def firstMissingPositive(self, nums: List[int]) -> int:
        smallest=1
        nums.sort()
        for i in range(len(nums)):
            if (smallest==nums[i]):
                smallest=smallest+1
           
 
        return smallest