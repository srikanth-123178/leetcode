class Solution:
    def isScramble(self, s1: str, s2: str) -> bool:
        memo = {}

        def helper(a, b):
            if (a, b) in memo:
                return memo[(a, b)]
            
            if a == b:
                memo[(a, b)] = True
                return True
            if sorted(a) != sorted(b):
                memo[(a, b)] = False
                return False
            
            n = len(a)
            for i in range(1, n):
                # case 1: no swap
                if helper(a[:i], b[:i]) and helper(a[i:], b[i:]):
                    memo[(a, b)] = True
                    return True
                # case 2: with swap
                if helper(a[:i], b[-i:]) and helper(a[i:], b[:-i]):
                    memo[(a, b)] = True
                    return True

            memo[(a, b)] = False
            return False

        return helper(s1, s2)
