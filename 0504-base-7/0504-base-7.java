class Solution {
    public String convertToBase7(int num) {
       int num1=num;
        if (num1==0){
            return "0";
        }
        StringBuilder s1=new StringBuilder();
        if (num1<0){
            num1=num1*-1;
        }
        while (num1>0){
            int res=num1%7;
            num1=num1/7;
            s1.append(res);
        }
        if (num<0){
           s1.append("-");
        
        }
        return s1.reverse().toString();
    }
}