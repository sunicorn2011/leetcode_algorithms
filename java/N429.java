import java.util.*;

public class N429 {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if(root == null) return res;
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);
        while(!queue.isEmpty()){
            List<Integer> level = new ArrayList<>();
            int level_cnt = queue.size();
            for(int i = 0;i < level_cnt;i++){
                Node cur_node = queue.poll();
                level.add(cur_node.val);
                for(Node node:cur_node.children){
                    if(node != null) queue.add(node);
                }
            }
            res.add(level);
        }
        return res;
    }
}
