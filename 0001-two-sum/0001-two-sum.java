class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int x=target-nums[i];
            if(map.containsKey(x)){
                return new int[]{map.get(x),i};
            }
            map.put(nums[i],i);
        }
        return null;
        
    }
}