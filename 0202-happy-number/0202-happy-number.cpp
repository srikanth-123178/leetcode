class Solution {
public:
    bool isHappy(int n) {
        unordered_set<int> seen; // to detect cycles

        while (n != 1 && !seen.count(n)) {
            seen.insert(n);
            int res = 0;
            int temp = n;
            while (temp > 0) {
                int rem = temp % 10;
                res = res + rem * rem;
                temp = temp / 10;
            }
            n = res;
        }

        return n == 1;
    }
};
