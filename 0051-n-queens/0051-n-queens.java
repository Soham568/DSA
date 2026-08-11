class Solution {
    public void solve(int col,char[][] board,int n,int[] left,int[] upperDiagonal,int[] lowerDiagonal,List<List<String>> ans){
        if(col == n){
            List<String> temp = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                temp.add(new String(board[i]));
            }
            ans.add(temp);
            return;
        }
        for (int row = 0; row < n; row++) {
            if (left[row] == 0 && upperDiagonal[row+col]==0 && lowerDiagonal[n-1 + col - row] == 0)  {
                board[row][col] ='Q';
                left[row] = 1;
                upperDiagonal[row+col] = 1;
                lowerDiagonal[n-1 + col - row] = 1;

                solve(col+1, board, n, left, upperDiagonal, lowerDiagonal, ans);

                board[row][col] = '.';
                left[row] = 0;
                upperDiagonal[row+col] = 0;
                lowerDiagonal[n-1 + col - row] = 0;
            }
        }
    }
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        char[][] board = new char[n][n];
        for(char[] row : board) Arrays.fill(row,'.');
        int[] left = new int[n];
        int[] upperDiagonal = new int[2*n - 1];
        int[] lowerDiagonal = new int[2*n - 1];
        solve(0,board,n,left,upperDiagonal,lowerDiagonal,ans);
        return ans;
    }
}