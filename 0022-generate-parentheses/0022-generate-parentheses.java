class Solution {
    void generate(int n,String curr, int open, int close,List<String> list){
         if (curr.length()== 2*n) {
            list.add(curr);
            return;
        }
        if (open<n) {
            generate(n, curr+"(", open+1, close, list);
        }
        if (close<open) {
            generate(n, curr+')', open, close+1, list);
        }
    }
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        generate(n,"",0,0,list);
        return list;
    }
}