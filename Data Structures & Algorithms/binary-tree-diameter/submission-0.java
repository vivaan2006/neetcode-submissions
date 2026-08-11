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
    public int diameterOfBinaryTree(TreeNode root) {
        int[] heights = new int[1];
        dfs(root, heights);
        return heights[0]; // store largest height in 0, smaller in 1
    }
    private int dfs(TreeNode root, int[] heights){
        if(root == null){
            return 0;
        }
        int left = dfs(root.left, heights);
        int right = dfs(root.right, heights);
         heights[0] = Math.max(heights[0], left + right);// review line
        return Math.max(left, right) + 1;
        
    }
}
