class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0,right=0;
        int maxlen=Math.min(s.length(),1);
        HashSet<Character>set=new HashSet<>();
        while(right<s.length()){
            char c=s.charAt(right);
            while(set.contains(c)){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(c);
            maxlen=Math.max(maxlen,right-left+1);
            right++;

        }
        return maxlen;
        
    }
}