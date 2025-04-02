class Solution:
    def moveZeroes(self, nums):
        zero_index = 0  # Pointer to track where the next non-zero should be placed

        # Move non-zero elements to the front
        for i in range(len(nums)):
            if nums[i] != 0:
                nums[i], nums[zero_index] = nums[zero_index], nums[i]
                zero_index += 1

        return nums  # Return modified array for verification (Not needed in GFG)
