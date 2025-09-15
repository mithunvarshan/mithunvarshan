class Solution {
    public int maxProduct(int[] nums) {
       int val=1,max=Integer.MIN_VALUE;
       for(int i=0;i<nums.length;i++){
        if(val==0)val=1;
            val*=nums[i];
            if(val>max){
                max=val;
            }
       }
       int back=1;
       for(int i=nums.length-1;i>=0;i--){
        if(back==0)back=1;
            back*=nums[i];
            if(back>max){
                max=back;
            }
       }
       return max; 
    }
}