class Solution {
    public int maxAbsoluteSum(int[] arr) {
        if(arr.length==1)return Math.abs(arr[0]);
        int minSum = arr[0];
        int maxSum = arr[0];
        int ans = Math.abs(arr[0]);
        for(int i = 1; i<arr.length;i++){
            maxSum = Math.max(maxSum+arr[i],arr[i]);
            minSum = Math.min(minSum+arr[i],arr[i]);
            ans = Math.max(ans,Math.max(Math.abs(minSum),Math.abs(maxSum)));
        }
        return ans;
    }
}