class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer>set=new HashSet<>();
        for(int n:nums){
        set.add(n);
        }
        int maxlen=0;
        for(int i:set){
            int num=i;
            if(set.contains(num-1)){
                continue;
            }
            int length=0;
            while(set.contains(num)){
                length++;
                num++;
            }
            maxlen=Math.max(maxlen,length);
        }
        return maxlen;
        
    }
}