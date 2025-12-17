class Solution {
    public int lengthOfLongestSubstring(String s) {
        int start=0;
        int end=0;
        int maxlength=Math.min(s.length(),1);
        HashSet<Character>set=new HashSet<>();
        while(end<s.length()){
            char ch=s.charAt(end);
            while(set.contains(ch)){
                set.remove(s.charAt(start));
                start++;
            }
            set.add(ch);
            int window=end-start+1;
            maxlength=Math.max(maxlength,window);
            end++;
        }
        return maxlength;
    }
}