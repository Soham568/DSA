class Solution {
    void findSum(int i,int n,int k,List<Integer> curr,List<List<Integer>> list,int[] arr){
        if(i==arr.length){
            if (n==0 && curr.size()==k) {
                list.add(new ArrayList<>(curr));
            }
            return;
        }
        findSum(i+1,n, k, curr,list,arr);

        if (n-arr[i]>=0) {
            curr.add(arr[i]);
            findSum(i+1, n-arr[i], k, curr, list, arr);
            curr.remove(curr.size()-1);
        }
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        int[] arr = {1,2,3,4,5,6,7,8,9};
        findSum(0, n, k, curr, ans, arr);
        return ans;
    }
}