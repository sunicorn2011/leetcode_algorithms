import java.util.*;

public class N589 {
    public List<Integer> preorder(Node root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) return res;
        LinkedList<Node> stack = new LinkedList<>();
        stack.add(root);
        while (!stack.isEmpty()) {
            Node cur = stack.pollLast();
            res.add(cur.val);
            List<Node> childnodes = cur.children;
            for (int i = childnodes.size() - 1; i >= 0; i--) {
                stack.add(childnodes.get(i));
            }
        }
        return res;
    }
}
