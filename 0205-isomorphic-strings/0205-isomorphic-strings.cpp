class Solution {
public:
    bool isIsomorphic(string s, string t) {
        if (s.size()!=t.size()){
            return false;
        }
        int arr[256]={0};
        int arr1[256]={0};
        for (int i=0;i<s.size();i++){
            char ch=s[i];
            char ch1=t[i];
            if (arr[ch]!=arr1[ch1]){
                return false;
            }
            arr[ch]=i+1;
            arr1[ch1]=i+1;

        }
        return true;
        
    }
};