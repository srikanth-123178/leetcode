class Solution {
public:
    bool isAnagram(string s, string t) {
        sort(s.begin(),s.end());
        sort(t.begin(),t.end());
        int count=0;
        if (s.size()!=t.size()) return false;
        for (int i=0;i<s.size();i++){
            if (s[i]==t[i]){
                count=count+1;
            }
        }
        if (count==s.size()) return true;
        return false;
    }
};