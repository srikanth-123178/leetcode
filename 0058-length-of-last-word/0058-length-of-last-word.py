class Solution:
    def lengthOfLastWord(self, s: str) -> int:
        i=len(s)-1
        count=0
        while(s[i]==" " and i>=0):
            i=i-1
        while(i>=0 and s[i]!=" "):
            count=count+1
            i=i-1
        return count

        
        