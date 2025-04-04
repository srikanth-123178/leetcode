class Solution {
public:
    int compress(vector<char>& chars) {
        int write = 0;  // Where to write the compressed character
        int i = 0;      // Read pointer

        while (i < chars.size()) {
            char currentChar = chars[i];
            int count = 0;

            // Count the number of occurrences of the current character
            while (i < chars.size() && chars[i] == currentChar) {
                i++;
                count++;
            }

            // Write the character
            chars[write++] = currentChar;

            // If count > 1, write the digits of count
            if (count > 1) {
                string countStr = to_string(count);
                for (char c : countStr) {
                    chars[write++] = c;
                }
            }
        }

        return write;  // The new length of the compressed array
    }
};
