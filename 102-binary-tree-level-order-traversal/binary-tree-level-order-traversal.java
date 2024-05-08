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
import java.util.Queue;
import java.util.LinkedList;

class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> returnList = new LinkedList<>();

        if(root == null) { return returnList; }

        Queue<TreeNode> queue = new LinkedList<>();

        queue.add(root);

        while(!queue.isEmpty()) {
            List<Integer> level = new ArrayList<>();
            int cnt = queue.size();
            for(int i = 0; i < cnt; i++) {
                TreeNode temp = queue.poll();
                level.add(temp.val);
                if(temp.left != null) {
                    queue.add(temp.left);
                }
                if(temp.right != null) {
                    queue.add(temp.right);
                }
            }
            returnList.add(level);
        }

        return returnList;
    }
}
// using queue
// 