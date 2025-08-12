class Solution:
    def canJump(self, nums: List[int]) -> bool:
        maxreach=0
        lastindex=len(nums)-1
        for i in range(len(nums)):
            if i<=maxreach:
                maxreach=max(maxreach,i+nums[i])
        if (maxreach>=lastindex):
            return True
        else:
            return False



        