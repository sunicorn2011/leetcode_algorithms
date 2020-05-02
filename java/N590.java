import java.util.*;

public class N590 {
    /*
    N叉树的后续遍历
     */
    public List<Integer> postorder(Node root) {

        List <Integer> res = new ArrayList<>();
        if(root == null) return res;
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()){
            Node cur = stack.pop();
            res.add(0, cur.val);
            for(Node child: cur.children){
                stack.push(child);
            }
        }
        return res;
    }
}
