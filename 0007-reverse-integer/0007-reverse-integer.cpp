class Solution {
public:
    int reverse(int x) {
       long long num=x;
       long long sum=0;
       if (num<0){
        num=num*-1;
       }
       while(num>0){
        int div=num%10;
        sum=sum*10+div;
        num=num/10;

       }
       if (x<0){
        sum=-sum;
       }
       if (sum > INT_MAX || sum < INT_MIN) {
        return 0;
}

       return sum;
        
       
        
    }
};