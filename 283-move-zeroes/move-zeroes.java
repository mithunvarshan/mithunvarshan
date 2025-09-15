class Solution {
    public void moveZeroes(int[] nums) {
       int zero=0,length=0,n=nums.length-1;
       for(int right=0;right<nums.length;right++){
          if(nums[right]!=0){
            nums[length]=nums[right];
            length++;
          }
          if(nums[right]==0)zero++;
         }
         for(int i=0;i<zero;i++){
            nums[length++]=0;
         }
      
    }
}