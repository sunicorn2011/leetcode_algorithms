import java.util.*;

public class N965 {
    public boolean isUnivalTree(TreeNode root) {
        int uniVal = root.val;
        LinkedList<TreeNode> stack = new LinkedList<>();
        TreeNode cur = root;
        while (cur != null || !stack.isEmpty()) {
            while(cur != null){
                stack.add(cur);
                cur = cur.left;
            }
            cur = stack.pollLast();
            if (cur.val != uniVal) return false;
            cur = cur.right;
        }
        return true;
    }
}
