class Solution {
public:
    string longestPalindrome(string s) {
        if (s.empty()) return "";
        int maxLength = 1;
        int start = 0;

        for (int i = 0; i < s.length(); i++) {
            // Odd-length palindrome
            int l = i, r = i;
            while (l >= 0 && r < s.length() && s[l] == s[r]) {
                if (r - l + 1 > maxLength) {
                    start = l;
                    maxLength = r - l + 1;
                }
                l--;
                r++;
            }

            // Even-length palindrome
            l = i, r = i + 1;
            while (l >= 0 && r < s.length() && s[l] == s[r]) {
                if (r - l + 1 > maxLength) {
                    start = l;
                    maxLength = r - l + 1;
                }
                l--;
                r++;
            }
        }

        return s.substr(start, maxLength);
    }
};
