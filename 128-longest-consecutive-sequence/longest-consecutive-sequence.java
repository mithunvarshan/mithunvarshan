class Solution {
    public int longestConsecutive(int[] nums) {
 int n=nums.length;
     if(n==0)return 0;
     HashSet<Integer>list=new HashSet<>();
    for(int i=0;i<n;i++){
          list.add(nums[i]);
    }
    int max=0;
     Integer[] arr = list.toArray(new Integer[0]);
  for(int i=0;i<arr.length;i++){
      int count=1;
        int val=arr[i];
        if(!list.contains(val-1)){
            int cur=val;
            count=1;
        
            while(list.contains(cur+1)){
                count++;
                cur++;
            }
        }
       max=Math.max(count,max);
    }
    return max;
    }
    }