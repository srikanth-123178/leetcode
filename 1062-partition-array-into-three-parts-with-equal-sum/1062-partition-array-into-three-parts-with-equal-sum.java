class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        int sum=0,sum1=0,count=0;
        for (int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        if (sum%3!=0){
            return false;
        }
        int target=sum/3;
        for (int i=0;i<arr.length;i++){
            sum1=sum1+arr[i];
            if (target==sum1){
                count++;
                sum1=0;
            }
        }
       
        return count>=3;
    }
}