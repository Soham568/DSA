class Solution {
    public int maximumSum(int[] arr) {
        int nodelete = arr[0];
        int oneDelete = Integer.MIN_VALUE;
        int ans = arr[0];
        for(int i = 1;i<arr.length;i++){
            int prevND = nodelete;
            int prevOD = oneDelete;
            nodelete = Math.max(nodelete+arr[i],arr[i]);
            int v1;
            if(oneDelete == Integer.MIN_VALUE) v1 = arr[i];
            else v1 = prevOD + arr[i];
            oneDelete = Math.max(prevND,v1);
            ans = Math.max(ans,Math.max(nodelete,oneDelete));
        }
        return ans;
    }
}