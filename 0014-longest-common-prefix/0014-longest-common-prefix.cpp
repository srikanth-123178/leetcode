class Solution {
public:
    string longestCommonPrefix(vector<string>& strs) {
        if (strs.empty()) return "";

        // Use the first string as reference
        string prefix = strs[0];

        for (int i = 1; i < strs.size(); i++) {
            int j = 0;
            // Compare current prefix with the i-th string
            while (j < prefix.size() && j < strs[i].size() && prefix[j] == strs[i][j]) {
                j++;
            }
            // Reduce the prefix to the matched portion
            prefix = prefix.substr(0, j);

            // If no common prefix at any point, return ""
            if (prefix.empty()) return "";
        }

        return prefix;
    }
};
