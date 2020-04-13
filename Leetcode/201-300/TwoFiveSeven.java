import java.util.ArrayList;
import java.util.List;

public class TwoFiveSeven {

    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

    List<String> ans;

    // Initial solution with recursion;
    public List<String> binaryTreePaths(TreeNode root) {
        ans = new ArrayList();
        helper(root, "");
        return ans;
    }

    private void helper(TreeNode root, String cur) {
        if(root == null) return;
        if(root.left == null && root.right == null) {
            ans.add(cur + root.val);
            return;
        }
        cur += root.val;
        cur += "->";
        helper(root.left, cur);
        helper(root.right, cur);
    }

}
