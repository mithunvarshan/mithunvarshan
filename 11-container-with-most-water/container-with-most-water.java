class Solution {
    public int maxArea(int[] height) {
/*        int left=0,right=height.length-1;
        int max=0,cur=0;
        while(left<right){
           cur=(right-left)*Math.min(height[left],height[right]);
        
        max=Math.max(max,cur);
        if(height[left]<height[right]){
            left++;
        }else{
            right--;
        }
        }
        return max;
    }
    */
    int left=0,right=height.length-1;
    int max=0,cur=0;
    while(left<right){
        cur=(right-left)*Math.min(height[left],height[right]);
        max=Math.max(max,cur);
        if(height[left]<height[right]){
            left++;
        }else{
            right--;
        }
    }
    return max;
}
}