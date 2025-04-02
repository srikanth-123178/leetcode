from math import gcd  # Import gcd function

class Solution:
    def gcdOfStrings(self, str1: str, str2: str) -> str:
        if str1 + str2 != str2 + str1:
            return ""  # No common divisor string exists
        
        gcd_length = gcd(len(str1), len(str2))
        return str1[:gcd_length]  # The common divisor string
