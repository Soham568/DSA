class Solution {
    void uniqueSubsets(int[] arr,List<Integer> ds,int index,List<List<Integer>> ans){
        ans.add(new ArrayList<>(ds));

        for (int i = index; i < arr.length; i++) {
            if (i>index && arr[i]==arr[i-1]) {
                continue;
            }
            ds.add(arr[i]);
            uniqueSubsets(arr, ds, i+1, ans);
            ds.remove(ds.size()-1);
            }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        Arrays.sort(nums);
        uniqueSubsets(nums, ds, 0, ans);
        return ans;
    }
}