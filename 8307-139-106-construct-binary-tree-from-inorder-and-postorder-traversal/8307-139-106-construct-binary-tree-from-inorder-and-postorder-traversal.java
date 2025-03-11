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
    private int postorderIndex;
    private HashMap<Integer,Integer> inorderhash;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        inorderhash=new HashMap<>();
        postorderIndex=postorder.length-1;;
    for(int i=0;i<inorder.length;i++){
        inorderhash.put(inorder[i],i);
    }
    return buildSubTree(postorder,0,postorder.length-1);
    }
    private TreeNode buildSubTree(int[] postorder,int left,int right){
        if(left>right) return null;
        int rootValue=postorder[postorderIndex--];
        int rootIndex=inorderhash.get(rootValue);
        TreeNode root=new TreeNode(rootValue);
        
        root.right=buildSubTree(postorder,rootIndex+1,right);
        root.left=buildSubTree(postorder,left,rootIndex-1);
        return root;
    }
}