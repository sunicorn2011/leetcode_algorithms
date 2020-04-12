import java.util.*;

public class N94 {
    public List<Integer> inorderTraversal(TreeNode root) {
        LinkedList<TreeNode> stack = new LinkedList<>();
        List<Integer> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        TreeNode cur = root;
        while (cur != null || !stack.isEmpty()) {
            while (cur != null) {
                stack.add(cur);
                cur = cur.left;
            }
            cur = stack.pollLast();
            res.add(cur.val);
            cur = cur.right;
        }
        return res;
    }
}
