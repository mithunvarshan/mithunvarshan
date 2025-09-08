class Solution {
    public int[] productExceptSelf(int[] nums) {
        int num[]=new int[nums.length];
        int post=1,prev=1;
        for(int i=0;i<nums.length;i++){
            num[i]=1;
        }
         for(int i=0;i<nums.length;i++){
            num[i]*=prev;
            prev*=nums[i];
         }
          for(int i=nums.length-1;i>=0;i--){
            num[i]*=post;
            post*=nums[i];
          }
          return num;
}
}