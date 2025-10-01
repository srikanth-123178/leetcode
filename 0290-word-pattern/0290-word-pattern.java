class Solution {
    public boolean wordPattern(String pattern, String s) {
        String [] words=s.split(" ");
        if (pattern.length()!=words.length){
            return false;
        }
        HashMap<Character, String> mp=new HashMap<>();
        HashMap<String, Character>mp1=new HashMap<>();
        for (int i=0;i<(Math.min(pattern.length(),words.length));i++){
            char c=pattern.charAt(i);
            String str=words[i];
            if (mp.containsKey(c)){
                if (!mp.get(c).equals(str)){
                    return false;
                }
            } else {
                mp.put(c,str);
            }
            if (mp1.containsKey(str)){
                if (mp1.get(str)!=c){
                    return false;
                }
            } else {
                mp1.put(str,c);
            }
        }
        return true;
        
        



    }
}