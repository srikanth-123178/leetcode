class Solution {
    public String reverseVowels(String s) {
        char[] arr=s.toCharArray();
        int i=0;
        int j=arr.length-1;
        while(i<j){
            if (!isvowel(arr[i])){
                i++;
            } else if(!isvowel(arr[j])){
                j--;

            } else{
                char temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }
        }
        return new String(arr);
    }
    public boolean isvowel(char c){
        return "AEIOUaeiou".indexOf(c)!=-1;
    }
}