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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        rec(root, 0, res);
        return res;
    }

    public void rec(TreeNode root, int level, List<List<Integer>> list) {
        if (root == null) return;

        if (list.size() <= level) {
           list.add(new ArrayList<>());
        }

        list.get(level).add(root.val);
        rec(root.left, level + 1, list);
        rec(root.right, level + 1, list);
    }

}