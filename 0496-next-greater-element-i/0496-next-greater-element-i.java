class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        ArrayList<Integer> arr=new ArrayList<>();
        for (int i=0;i<nums1.length;i++){
            boolean found=false;
          for (int j=0;j<nums2.length;j++){
            if (nums1[i]==nums2[j]){
                found=true;
                boolean added=false;
                for (int k=j+1;k<nums2.length;k++){
                    if (nums2[k]>nums2[j]){
                        arr.add(nums2[k]);
                        added=true;
                        break;
                    }
                }
                if (!added) arr.add(-1);
                break;

            }
          }
          if (!found) arr.add(-1);
        }
        
            
        
        
        int [] arr1=new int [arr.size()];
        for (int k=0;k<arr.size();k++){
            arr1[k]=arr.get(k);
        }
        return arr1;
    }
}