class Solution {
    public boolean isOneBitCharacter(int[] bits) {
       int n=bits.length-1;
       int i=0;
        while(i<n){
            if (bits[i]==0){
                i=i+1;
            }
            if (bits[i]==1){
                i=i+2;
            }
        }
        return i==n;
    }
}