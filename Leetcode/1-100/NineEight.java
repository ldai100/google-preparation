public class NineEight {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
    
    public boolean isValidBST(TreeNode root) {
        return helper(root, null, null);
    }

    private boolean helper(TreeNode root, Integer min, Integer max) {
        if(root == null) {
            return true;
        }

        if( (max != null && root.val >= max) || (min != null && root.val <= min)) {
            return false;
        }

        return helper(root.left, min, root.val) & helper(root.right, root.val, max);
    }
}
