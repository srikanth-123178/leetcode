class Solution {
public:
    bool isPalindrome(string s) {
        s.erase(remove(s.begin(),s.end(),' '),s.end());
        int k=0;
        for(int i=0;i<s.size();i++){
            char ch=s[i];
            if (!((ch>='a' && ch<='z') || (ch>='A' && ch<='Z') || (ch>='0' && ch<='9'))){
                s.erase(i,1);
                i--;
            } else{
                continue;
            }
        }
        int n=s.size()-1;
        while (k<=n){
            if (tolower(s[k])!=tolower(s[n])){
                return false;
            } else{
                k++;
                n--;
            }
        }
        return true;
    }
};