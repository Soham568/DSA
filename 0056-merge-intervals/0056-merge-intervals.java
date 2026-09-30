class Solution {
    public int[][] merge(int[][] intervals) {
      List<List<Integer>> ans = new ArrayList<>();
      Arrays.sort(intervals,(a,b)->a[0]-b[0]);
      int start1 = intervals[0][0], end1 = intervals[0][1];
      for (int i = 1; i < intervals.length; i++) {
        int start2 = intervals[i][0];
        int end2 = intervals[i][1];
        if (end1>=start2) {
            end1 = Math.max(end1, end2);
            continue;
        }
        ans.add(Arrays.asList(start1,end1));
        start1 = start2;
        end1 = end2;
      }
      ans.add(Arrays.asList(start1,end1));
      int[][] result = new int[ans.size()][2];

        for (int i = 0; i < ans.size(); i++) {

            result[i][0] = ans.get(i).get(0);
            result[i][1] = ans.get(i).get(1);
        }
      return result;
      
    }
}