import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class OneOneOneZero {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    private Set<Integer> helper;
    private List<TreeNode> ans;

    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        ans = new ArrayList();

        helper = new HashSet();
        for(int i = 0; i < to_delete.length; i++) {
            helper.add(to_delete[i]);
        }

        traverse(root, true);
        return ans;

    }

    private TreeNode traverse(TreeNode root, boolean isRoot) {
        if(root == null) {
            return null;
        }
        boolean deleted = helper.contains(root.val);
        if(isRoot && !deleted) {
            ans.add(root);
        }
        root.left = traverse(root.left, deleted);
        root.right = traverse(root.right, deleted);

        return deleted ? null:root;
    }
}
