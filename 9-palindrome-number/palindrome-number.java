class Solution {
    public boolean isPalindrome(int x) {
       if(x<0)return false;
       int num=0,val=x;
       while(val!=0){
         int digit=val%10;
         num=num*10+digit;
         val=val/10;
       }
       System.out.print(num);
       return x==num;
    }
}