class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
      int total=numBottles;
      int ex=numBottles;
      while (ex>=numExchange){
        int ans=ex/numExchange;
        total=total+ans;
        ex=ex%numExchange + ans;

      }
      return total;

    }
}