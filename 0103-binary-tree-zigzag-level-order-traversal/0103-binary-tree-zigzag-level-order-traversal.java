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
            List<Integer> temp = new ArrayList<>();
            while(levelSize > 0){
                TreeNode t = q.poll();
                if(t.left != null) q.offer(t.left);
                if(t.right != null) q.offer(t.right);
                if(leftToRight == 1){
                    temp.add(t.val);
                }else{
                    temp.add(0,t.val);
                }
                levelSize--;
            }
            ans.add(temp);
            leftToRight = 1 - leftToRight; 
        }
        return ans;
    }
}