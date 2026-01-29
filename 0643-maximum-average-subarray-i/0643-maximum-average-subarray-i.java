class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int wsum=0;
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<k;i++){
            wsum+=nums[i];
        }
        maxsum=wsum;
        for(int i=k;i<nums.length;i++){
            wsum=wsum-nums[i-k]+nums[i];
        
        if(wsum>maxsum){
            maxsum=wsum;
        }
        }
        return (double)maxsum/k;
    }
}