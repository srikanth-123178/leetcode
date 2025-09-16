class Solution {
    public int lengthOfLastWord(String s) {
        String ans=s.trim();
        int count=0;
        int n=ans.length()-1;
        while(n>=0 && ans.charAt(n)!=' '){
            n--;
            count=count+1;

        } 
        return count;
    }
}