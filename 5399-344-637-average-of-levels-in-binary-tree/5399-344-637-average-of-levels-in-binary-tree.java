/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, cTreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
     Queue<TreeNode> q=new LinkedList<>();
     List<Double> result=new ArrayList<>();
     q.add(root);
     while(!q.isEmpty()){
        long sum=0;
        int size=q.size();
        for(int i=0;i<size;i++){
            TreeNode node=q.poll();
            sum+=node.val;
            if(node.right!=null) q.add(node.right);
            if(node.left!=null) q.add(node.left);
        }
        result.add((double)sum/size);
     }   
     return result;
    }
}