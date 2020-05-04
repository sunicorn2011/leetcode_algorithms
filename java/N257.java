import java.util.*;
public class N257 {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new LinkedList();
        if (root == null) return res;
        makePath(root, "", res);
        return res;
    }

    public void makePath(TreeNode node, String path, List<String> res) {
        if(node.left != null) {
            makePath(node.left, path + Integer.toString(node.val) + "->", res);
        };
        if(node.right != null) {
            makePath(node.right, path + Integer.toString(node.val) + "->", res);
        };
        if(node.left == null && node.right == null) {
            res.add(path + Integer.toString(node.val));
        }
    }
}
