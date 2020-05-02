import java.util.*;

public class N102 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if(root == null) return res;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        while(!queue.isEmpty()){
            List<Integer> level = new ArrayList<>();
            int level_cnt = queue.size();
            for(int i = 0;i < level_cnt;i++){
                TreeNode cur_node = queue.poll();
                level.add(cur_node.val);
                if (cur_node.left != null) queue.add(cur_node.left);
                if (cur_node.right != null) queue.add(cur_node.right);
            }
            res.add(level);
        }
        return res;
    }
}
