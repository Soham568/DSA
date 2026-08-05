class Solution {
    void findCombinations1(int index,int target,int[] arr,List<List<Integer>> answers,List<Integer> ds){
        if (target == 0) {
            answers.add(new ArrayList<>(ds));
            return;
        }
        for (int i = index; i < arr.length; i++) {
            if (i>index && arr[i]==arr[i-1]) {
                continue;
            }

            if (arr[i]>target) {
                break;
            }
            ds.add(arr[i]);
            findCombinations1(i+1, target - arr[i], arr, answers, ds);
            ds.remove(ds.size()-1);
    }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        Arrays.sort(candidates);
        findCombinations1(0,target,candidates,ans,ds);
        return ans;
    }
}