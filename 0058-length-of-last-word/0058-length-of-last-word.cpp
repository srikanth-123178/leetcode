class Solution {
public:
    int lengthOfLastWord(string s) {
       int n=s.size()-1;
       int count=0;
       string str1;
       while (n>=0 && s[n]==' '){
        n=n-1;
       }
        while(n>=0){
            if (s[n]==' '){
                break;
            }
            else {
                str1=str1+s[n];

            }
            n=n-1;
        }
        return str1.length();
        
    }
};