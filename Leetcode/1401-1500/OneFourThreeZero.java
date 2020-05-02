public class OneFourThreeZero {


    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    private boolean ans;

    public boolean isValidSequence(TreeNode root, int[] arr) {
        ans = false;
        helper(root, arr, 0);
        return ans;
    }

    private void helper(TreeNode root, int[] arr, int index) {
        if (root == null || index >= arr.length || root.val != arr[index]) return;
        if (root.left == null && root.right == null && index == arr.length - 1) {
            ans = true;
        }
        helper(root.left, arr, index + 1);
        helper(root.right, arr, index + 1);
    }
}
