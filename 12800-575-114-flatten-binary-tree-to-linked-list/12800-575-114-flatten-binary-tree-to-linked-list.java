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
    public void flatten(TreeNode root) {
        TreeNode cur = root;
        
        while (cur != null) {
            if (cur.left != null) {
                // Find the predecessor (rightmost node in left subtree)
                TreeNode pred = cur.left;
                while (pred.right != null && pred.right != cur) {
                    pred = pred.right;
                }
                
                // Create a temporary link if not already created
                if (pred.right == null) {
                    pred.right = cur.right;  // Move original right subtree
                    cur.right = cur.left;    // Move left subtree to right
                    cur.left = null;         // Set left as null
                }
            }
            
            // Move to the next node in preorder (always move right)
            cur = cur.right;
        }
    }
}
