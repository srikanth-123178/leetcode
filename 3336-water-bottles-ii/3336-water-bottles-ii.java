class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int total=numBottles;
        int td=numBottles;
        int left=numExchange;
        while (td>=left){
            int x=1;
            total=total+x;
            td=td-left+x;
            left++;
        }
        return total;
    }
}