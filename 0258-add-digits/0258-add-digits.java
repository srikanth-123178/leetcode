class Solution {
    public int addDigits(int num) {
        if (num == 0) {
            return 0;
        }
        int res = num;

        while (res >= 10) {   // keep repeating until single digit
            int sum = 0;      // reset sum for each round
            while (res > 0) {
                int rem = res % 10;   // extract digit
                sum = sum + rem;      // add digit
                res = res / 10;       // move to next digit
            }
            res = sum;   // prepare for next round if sum >= 10
        }

        return res;  // final single digit
    }
}
