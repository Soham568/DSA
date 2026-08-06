class Solution {
    boolean isDivisible(int num,int t){
        int prod = 1;
        while(num>0){
            int n = num%10;
            prod*=n;
            num = num/10;
        }
        if(prod%t == 0){
            return true;
        }
        return false;
    }
    public int smallestNumber(int n, int t) {
        int low = n;
        int high = n+10;
        int ans = n+11;
        for(int i = n;i<=n+10;i++){
            if(isDivisible(i,t)){
                ans = Math.min(ans,i);
            }
        }
        return ans;
    }
}