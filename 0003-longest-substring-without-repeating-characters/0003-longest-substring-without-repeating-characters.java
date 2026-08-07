class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0)return 0;
        HashSet<Character> set = new HashSet<>();
        int left = 0;
        int maxCnt = 0;

        for(int right = 0;right<s.length();right++){
            while(set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;
            }

            set.add(s.charAt(right));
            maxCnt = Math.max(maxCnt,right-left+1);
        }
        return maxCnt;
    }
}