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

 /*
class Solution {
    int min = Integer.MAX_VALUE;
    TreeNode prev = null;

    public int getMinimumDifference(TreeNode root) {
        if(root != null) {
            if(root.left != null) {
                min = Math.min(min, root.val - root.left.val);
                prev = root.left;
                min = Math.min(min, getMinimumDifference(root.left));
            }
            
            if(root.right != null) {
                min = Math.min(min, root.right.val - root.val);
                prev = root.right;
                min = Math.min(min, getMinimumDifference(root.right));
            }
        }

        return min;
    }
}
*/

// similar to array thing
// keep track of largest element and smallest element
// traverse through the tree and update
// O(n logn), O(1)
// do a dfs - works since entries are sorted
// entries are sorted - close together #s will be close together
// find min of each child - parent

public class Solution {
    int min = Integer.MAX_VALUE;
    Integer prev = null;
    
    public int getMinimumDifference(TreeNode root) {
        if (root == null) return min;
        
        getMinimumDifference(root.left);
        
        if (prev != null) {
            min = Math.min(min, root.val - prev);
        }
        prev = root.val;
        
        getMinimumDifference(root.right);
        
        return min;
    }
    
}