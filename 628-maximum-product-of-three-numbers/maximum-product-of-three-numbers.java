class Solution {
    public int maximumProduct(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        int val=nums[n-1]*nums[n-2]*nums[n-3];
         int minimum=nums[0]*nums[1]*nums[n-1];
         int max=Math.max(val,minimum);
        return max;
    }
}