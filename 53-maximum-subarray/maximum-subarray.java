class Solution {
    public int maxSubArray(int[] nums) {
        int cur=nums[0];
        int max=nums[0];
        for(int i=1;i<nums.length;i++){
            int num=nums[i];
            cur=Math.max(num,cur+num);
           //  System.out.println(cur);
            //System.out.println(cur+num);
            max=Math.max(max,cur);

        }
        return max;
    }
}