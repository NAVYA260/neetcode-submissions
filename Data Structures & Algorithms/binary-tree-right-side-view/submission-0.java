/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public static void right(TreeNode root, List<Integer> a,int level) {
      if(root==null) return;
      if(level==a.size()) {
        a.add(root.val);
      }
      right(root.right,a,level+1);
      right(root.left,a,level+1);
    }
    public List<Integer> rightSideView(TreeNode root) {
        ArrayList<Integer> a = new ArrayList<>();
        right(root,a,0);
        return a;
    }
}
