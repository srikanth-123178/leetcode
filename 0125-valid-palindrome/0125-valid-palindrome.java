class Solution {
    public boolean isPalindrome(String s) {
       if(s.length()==1){
        return true;
       }
        String ans=s.trim();
        ans=ans.toLowerCase();
        
        String ans1=ans.replaceAll("[^a-z0-9]","");
        int i=0,j=ans1.length()-1;
        while(i<j){
            if (ans1.charAt(i)!=ans1.charAt(j)){
                return false;
            } else{
                i++;
                j--;
            }
        }
        return true;
    }
}