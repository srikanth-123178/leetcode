class Solution:
    def isPowerOfTwo(self, n: int) -> bool:
        if(n==1):
            return True
        x=1
        if(n%2!=0):
            return False
        while(2**x<=n):
            if(n==2**x):
                return True
            else:
                x=x+1

                
        return False
        