class Solution {
    public int hammingWeight(int n) {
        int count=0;
        while(n>0){
            int lastdigit=n&1;
            n=n>>1;
            if (lastdigit==1){
                count++;
            }
        }
        return count;
    }
}