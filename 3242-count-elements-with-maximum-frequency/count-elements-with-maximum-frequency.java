class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        List<Integer>list=new ArrayList(map.values());
        int max=Collections.max(list);
        System.out.print(max);
        int count=0;
        if(max<=1)return nums.length;
        for(int i=0;i<nums.length;i++){
            if(map.getOrDefault(nums[i],0)>=max){
                count++;
            }
        }
        return count;
    }
}