class Solution {
    public String minWindow(String s, String t) {
        int[] needed = new int[128];
        int[] have = new int[128];
        String ans = s;
        for(char c : t.toCharArray()){
            needed[c]++;
        }
        int left = 0;
        int required = t.length();
        int formed = 0;
        int bestStart = 0;
        int bestLength = Integer.MAX_VALUE;
        for(int right = 0;right < s.length();right++){
            char c = s.charAt(right);
            have[c]++;
            if(have[c]<= needed[c])formed++;
            while(formed == required){
                if(bestLength>right-left+1){
                    bestStart = left;
                    bestLength = right - left +1;
                }
                char leftChar = s.charAt(left);
                have[leftChar]--;
                if (have[leftChar] < needed[leftChar]) formed--;
                left++;
            }
        }
        return bestLength == Integer.MAX_VALUE
            ? ""
            : s.substring(bestStart, bestStart + bestLength);
    }
}