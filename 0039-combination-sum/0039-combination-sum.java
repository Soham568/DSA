class Solution {
    void findCombinations(int index,int target,int[] arr,List<List<Integer>> answers,List<Integer> ds){
        if (index==arr.length) {
            if (target==0) {
                answers.add(new ArrayList<>(ds));
            }
            return;
        }

        if (arr[index]<=target) {
            ds.add(arr[index]);
            findCombinations(index, target-arr[index], arr, answers, ds);
            ds.remove(ds.size()-1);
        }
        
        findCombinations(index+1, target, arr, answers, ds);
    }
    public List<List<Integer>> combinationSum(int[] arr, int target) {
        List<List<Integer>> answers = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        findCombinations(0, target, arr, answers, ds);
        return answers;
    }
}