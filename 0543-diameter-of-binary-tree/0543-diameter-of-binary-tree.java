class Solution {
    static int maxDia;

    public int levels(TreeNode root) {
        if(root == null) return 0;

        int leftLevels = levels(root.left);
        int rightLevels = levels(root.right);

        int myDia = leftLevels + rightLevels;

        maxDia = Math.max(maxDia, myDia);

        return 1 + Math.max(leftLevels, rightLevels);
    }

    public int diameterOfBinaryTree(TreeNode root) {
        maxDia = 0;
        levels(root);
        return maxDia;
    }
}
