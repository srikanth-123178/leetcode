class Solution:
    def plusOne(self, digits: List[int]) -> List[int]:
        n = len(digits)
        
        for i in range(n - 1, -1, -1):  # iterate from last to first
            if digits[i] < 9:
                digits[i] += 1
                return digits
            digits[i] = 0  # set to 0 and continue carry
        
        # If we reach here, all digits were 9 (e.g., 999 → 1000)
        return [1] + digits
