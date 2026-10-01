class Solution {
    
    public int[][] insert(int[][] intervals, int[] newInterval) {
       List<List<Integer>> ans = new ArrayList<>();
       if(intervals.length==0){
        int[][] a = {{newInterval[0],newInterval[1]}};
        return a;
       }
       int[][] newArr = new int[intervals.length+1][2];
       List<List<Integer>> res = new ArrayList<>();       
       boolean pushed = false;
       for(int i = 0;i<intervals.length;i++){
        if(!pushed && intervals[i][0]>=newInterval[0]){
            ans.add(Arrays.asList(newInterval[0],newInterval[1]));
            pushed = true;
        }
        ans.add(Arrays.asList(intervals[i][0],intervals[i][1]));
       }
       if(!pushed)ans.add(Arrays.asList(newInterval[0],newInterval[1]));
      int start1 = ans.get(0).get(0), end1 = ans.get(0).get(1);
      for(int i = 1; i < ans.size(); i++){
        int start2 = ans.get(i).get(0);
        int end2 = ans.get(i).get(1);
        if (end1>=start2) {
            end1 = Math.max(end1, end2);
            continue;
        }
        res.add(Arrays.asList(start1,end1));
        start1 = start2;
        end1 = end2;
      }
      res.add(Arrays.asList(start1,end1));
      int[][] result = new int[res.size()][2];

        for (int i = 0; i < res.size(); i++) {

            result[i][0] = res.get(i).get(0);
            result[i][1] = res.get(i).get(1);
        }
      return result;  
    }
}