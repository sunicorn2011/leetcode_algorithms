public class N559 {
    public int maxDepth(Node root) {
        if (root == null) return 0;
        int curMaxDepth = 0;
        for (Node node: root.children) {
            curMaxDepth = Math.max(curMaxDepth, maxDepth(node));
        }
        return curMaxDepth + 1;
    }
}
