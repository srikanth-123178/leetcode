class Solution {
    public int findLUSlength(String a, String b) {
       int answer=0;
        if (a.equals(b)){
            return -1;
        } else{
            answer=Math.max(a.length(),b.length());
        }
        return answer;

    }
}