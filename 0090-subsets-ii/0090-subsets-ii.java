class Solution {
    void uniqueSubsets(int[] arr,List<Integer> ds,int index,List<List<Integer>> ans){
        if (index == arr.length) {
            if (!ans.contains(ds)) {
                ans.add(new ArrayList<>(ds));
            }
            return;
        }
        ds.add(arr[index]);
        uniqueSubsets(arr, ds, index+1, ans);
        ds.remove(ds.size()-1);
        uniqueSubsets(arr, ds, index+1, ans);
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        Arrays.sort(nums);
        uniqueSubsets(nums, ds, 0, ans);
        return ans;
    }
}