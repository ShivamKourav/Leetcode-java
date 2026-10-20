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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> li = new ArrayList<>();
        inOrder(root,li);
        return li;
    }
    private void inOrder(TreeNode root, List<Integer> li){
        if(root == null)  return;
        inOrder(root.left,li);
        li.add(root.val);
        inOrder(root.right,li);
    }
}