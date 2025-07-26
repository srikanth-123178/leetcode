class Solution:
    def divide(self, dividend: int, divisor: int) -> int:
        INT_MAX = 2**31 - 1
        INT_MIN = -2**31

        # Edge case: overflow
        if dividend == INT_MIN and divisor == -1:
            return INT_MAX

        # Get sign of result
        negative = (dividend < 0) != (divisor < 0)

        dividend = abs(dividend)
        divisor = abs(divisor)
        result = 0

        while dividend >= divisor:
            temp = divisor
            multiple = 1
            # Double the divisor until it exceeds dividend
            while dividend >= (temp << 1):
                temp <<= 1
                multiple <<= 1
            dividend -= temp
            result += multiple

        return -result if negative else result
