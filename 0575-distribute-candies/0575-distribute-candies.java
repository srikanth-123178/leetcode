class Solution {
    public int distributeCandies(int[] candyType) {
        int num=candyType.length/2;
        Set <Integer> st=new HashSet<>();
        for (int i=0;i<candyType.length;i++){
            st.add(candyType[i]);
        }
        int m=st.size();
        if (num==m){
            return m;
        } else if (m==1){
            return m;
        } else if (num>m){
            return m;
        }
        return num;
    }
}