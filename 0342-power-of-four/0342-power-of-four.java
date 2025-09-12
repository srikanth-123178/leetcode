class Solution {
    public boolean isPowerOfFour(int n) {
        if (n==1 || n==4){
            return true;
        }
        if (n<=0){
            return false;
        }
        
        while (n % 4 == 0) {   // keep dividing n by 4 as long as it’s divisible
            n /= 4;            // shrink n fast (logarithmic steps)
        }
        return n == 1;         // if it became 1 -> yes, it was a power of 4
    }
}
