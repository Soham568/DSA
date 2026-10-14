/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root==null)return ans;

        Queue<TreeNode> q = new ArrayDeque<>();
        q.offer(root);
        int leftToRight = 1;
        while(!q.isEmpty()){
            int levelSize = q.size();
            int[] temp = new int[levelSize];
            int first = 0, last = levelSize - 1;
            while(levelSize > 0){
                TreeNode t = q.poll();
                if(t.left != null) q.offer(t.left);
                if(t.right != null) q.offer(t.right);
                if(leftToRight == 1){
                    temp[first]=t.val;
                    first++;
                }else{
                    temp[last] = t.val;
                    last--;
                }
                levelSize--;
            }
            ans.add(Arrays.stream(temp)
              .boxed()
              .collect(Collectors.toList()));
            leftToRight = 1 - leftToRight; 
        }
        return ans;
    }
}