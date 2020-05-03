public class N110 {
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }

    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        Integer leftDepth = maxDepth(root.left);
        Integer rightDepth = maxDepth(root.right);
        if (Math.abs(leftDepth - rightDepth) <= 1) {
            return isBalanced(root.left) && isBalanced(root.right);
        }
        return false;
    }

}
