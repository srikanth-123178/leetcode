class Solution {
    public boolean isSubsequence(String s, String t) {
      char [] v=s.toCharArray();
      char [] u=t.toCharArray();
      int j=0;
      if (v.length==0){
        return true;
      }
       
        for (int i=0;i<u.length && j<v.length;i++){
            if (u[i]==v[j]){
                j++;
            }
            if (j==v.length){
                return true;
            }
        }
        return false;
    }
}