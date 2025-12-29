class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character>set=new HashSet<>();
        int maxlength=Math.min(s.length(),1);
        int start=0;
        int end=0;
        for(int i=0;i<s.length();i++){
            while(set.contains(s.charAt(end))){
                set.remove(s.charAt(start));
                start++;
            }
            set.add(s.charAt(end));
            int window=end-start+1;
            maxlength=Math.max(maxlength,window);
            end++;
        }
        return maxlength;
    }
}