import java.util.*;

class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // add elements
        for (int n : nums) {
            pq.add(n);
        }

        int maxLen = 1;
        int currLen = 1;

        int prev = pq.poll();

        while (!pq.isEmpty()) {
            int curr = pq.poll();

            if (curr == prev) {
                // skip duplicates
                continue;
            } 
            else if (curr == prev + 1) {
                currLen++;
            } 
            else {
                maxLen = Math.max(maxLen, currLen);
                currLen = 1;
            }

            prev = curr;
        }

        maxLen = Math.max(maxLen, currLen);
        return maxLen;
    }
}
