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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        DFS(root,0,result);
        return result;
    }
    public static void DFS(TreeNode node,int level,List<Integer> result){
        if(node==null) return;
        if(level==result.size()){
            result.add(node.val);
        }
        DFS(node.right,level+1,result);
        DFS(node.left,level+1,result);
    }
}