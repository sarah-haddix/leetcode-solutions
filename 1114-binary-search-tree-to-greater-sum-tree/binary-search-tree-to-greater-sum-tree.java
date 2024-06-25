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
    static int sum = 0;

    public TreeNode bstToGst(TreeNode root) {
        // reverse inorder traversal
        sum = 0;
        traverse(root);
        return root;
    }

    public void traverse(TreeNode cur) {
        if(cur != null) {
            traverse(cur.right);
            cur.val += sum;
            sum += cur.val - sum;
            System.out.println(cur.val);
            traverse(cur.left);            
        }
    }
}
// start at greatest node, work backwards and add each time