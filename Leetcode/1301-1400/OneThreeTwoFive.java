public class OneThreeTwoFive {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
    
    // First solution that came to my mind;
    public TreeNode removeLeafNodes(TreeNode root, int target) {
        if(root == null) return null;
        removeLeafNodes(root.left, target);
        removeLeafNodes(root.right, target);
        if(root.left != null && root.left.val == -1) {
            root.left = null;
        }
        if(root.right != null && root.right.val == -1) {
            root.right = null;
        }
        if(root.left == null && root.right == null && root.val == target) {
            root.val = -1;
        }
        return root.val == -1 ? null:root;
    }
}
