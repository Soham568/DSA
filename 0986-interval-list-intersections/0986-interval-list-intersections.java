class Solution {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        List<List<Integer>> ans = new ArrayList<>();
        // List<List<Integer>> b = new ArrayList<>();
        int i=0,j=0;
        int n = firstList.length, m = secondList.length;
        while(i < n && j < m){
            int start1 = firstList[i][0],
            end1 = firstList[i][1],
            start2 = secondList[j][0],
            end2 = secondList[j][1];
            if(start1 <= start2){
                if(end1 >= start2){
                    int s = Math.max(start1,start2),
                    e = Math.min(end1,end2);
                    ans.add(Arrays.asList(s,e));
                }
            }else{
                if(end2 >= start1){
                    int s = Math.max(start1,start2),
                    e = Math.min(end1,end2);
                    ans.add(Arrays.asList(s,e));
                }
            }
            if(end1<=end2)i++;
            else j++;
        }
        int[][] result = new int[ans.size()][2];

        for (int p = 0; p < ans.size(); p++) {

            result[p][0] = ans.get(p).get(0);
            result[p][1] = ans.get(p).get(1);
        }
      return result;
    }
}