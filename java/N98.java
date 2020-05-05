import java.util.LinkedList;

public class N98 {
    public boolean isValidBST(TreeNode root) {
        if (root == null) return true;
        LinkedList<TreeNode> stack = new LinkedList<>();
        TreeNode cur = root;
        long preVal = Long.MIN_VALUE;
        while (cur != null || !stack.isEmpty()) {
            while (cur != null) {
                stack.add(cur);
                cur = cur.left;
            }
            cur = stack.pollLast();
            if (preVal >= cur.val) return false;
            preVal = cur.val;
            cur = cur.right;
        }
        return true;
    }
}
