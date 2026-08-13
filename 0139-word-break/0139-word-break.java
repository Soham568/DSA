class Solution {
    
    boolean solve(String s, List<String> wordDict,int index,int[] dp){
        if (index == s.length()) {
            return true;
        }
        if (dp[index]!=-1) {
            return dp[index] == 1;
        }
        for (String string : wordDict) {
            if (index + string.length()<= s.length() && 
            s.substring(index, index+string.length()).equals(string)) {
                if (solve(s, wordDict, index+string.length(),dp)) {
                    dp[index] = 1;
                    return true;
                }
            }
        }
        dp[index] = 0;
        return false;

    }
    public boolean wordBreak(String s, List<String> wordDict) {
        int[] dp = new int[s.length()];
        Arrays.fill(dp, -1);
        return solve(s,wordDict,0,dp);
    }
}