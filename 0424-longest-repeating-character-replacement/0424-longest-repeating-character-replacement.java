class Solution {
    int findMax(int[] arr){
        int ans = 0;
        for (int i : arr) {
            if (i>ans) {
                ans = i;
            }
        }
        return ans;
    }
    public int characterReplacement(String s, int k) {
        int left = 0;
        int maxLen = 0;
        int[] freq = new int[26];
        for (int right = 0; right < s.length(); right++) {
            freq[ s.charAt(right)- 'A']++;
            int len = right - left + 1;
            int maxChar = findMax(freq);
            int diff = len - maxChar;
            while (diff>k && left<right) {
                freq[s.charAt(left)-'A']--;
                left++;
                len--;
                maxChar = findMax(freq);
                diff = len - maxChar;
            }
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }
}