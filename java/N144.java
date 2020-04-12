import java.util.*;

public class N144 {
    class Solution {
        public List<Integer> preorderTraversal(TreeNode root) {
            LinkedList <TreeNode> stack = new LinkedList<>();
            List <Integer> res = new ArrayList<>();
            if(root == null){
                return res;
            }
            TreeNode cur = root;
            while(cur != null || !stack.isEmpty()){
                while(cur != null){
                    res.add(cur.val);
                    stack.add(cur);
                    cur = cur.left;
                }
                cur = stack.pollLast();
                cur = cur.right;
            }
            return res;

        }
    }
}
