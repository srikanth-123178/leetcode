class Solution {
public:
    bool isValid(string word) {
        if (word.size() <= 2) return false; // Length check

        int vowels = 0;
        int consonants = 0;
        int digits = 0;

        for (char ch : word) {
            if (!isalnum(ch)) return false; // If any symbol, invalid

            if (isalpha(ch)) {
                ch = tolower(ch);
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            } else if (isdigit(ch)) {
                digits++;
            }
        }

        return (vowels > 0 && consonants > 0);
    }
};
