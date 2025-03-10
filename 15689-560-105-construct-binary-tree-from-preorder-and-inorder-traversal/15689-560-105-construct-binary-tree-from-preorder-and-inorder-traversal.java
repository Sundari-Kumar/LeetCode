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
    private HashMap<Integer,Integer> inorderhash;
    private int preorderIndex=0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
    if(preorder.length!=inorder.length) return null;
    inorderhash=new HashMap<>();
    preorderIndex=0;
    for(int i=0;i<inorder.length;i++){
        inorderhash.put(inorder[i],i);
    }
    return buildSubTree(preorder,0,preorder.length-1);
    }
    private TreeNode buildSubTree(int[] preorder,int left,int right){
        if(left>right) return null;
        int rootvalue=preorder[preorderIndex++];
        TreeNode root=new TreeNode(rootvalue);
        int inorderIndex=inorderhash.get(rootvalue);
        root.left=buildSubTree(preorder,left,inorderIndex-1);
        root.right=buildSubTree(preorder,inorderIndex+1,right);
        return root;
            }
}