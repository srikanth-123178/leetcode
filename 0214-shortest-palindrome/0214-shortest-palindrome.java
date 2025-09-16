class Solution {
    public String shortestPalindrome(String s) {
        int j = 0;
        int n = s.length();
        
        // find longest prefix palindrome
        for (int i = n - 1; i >= 0; i--) {
            if (s.charAt(i) == s.charAt(j)) {
                j++;
            }
        }
        
        // if the whole string is already a palindrome
        if (j == n) {
            return s;
        }
        
        // suffix that is not part of palindrome prefix
        String suffix = s.substring(j);
        
        // reverse suffix to prepend
        String prefix = new StringBuilder(suffix).reverse().toString();
        
        // recursively solve the remaining prefix
        return prefix + shortestPalindrome(s.substring(0, j)) + suffix;
    }
}
