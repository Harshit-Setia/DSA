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
    int postIdx=0;
    TreeNode build(int[] in, int[] post,int inLeft,int inRight,HashMap<Integer,Integer> inIdx){

        if(inLeft>inRight)return null;

        TreeNode root=new TreeNode(post[postIdx]);

        int idx=inIdx.get(post[postIdx]);
        postIdx--;
        root.right=build(in,post,idx+1,inRight,inIdx);
        root.left=build(in,post,inLeft,idx-1,inIdx);

        return root;
    }
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        HashMap<Integer,Integer> inIdx=new HashMap<>();
        int n=inorder.length;
        postIdx=n-1;
        for(int i=0;i<n;i++){
            inIdx.put(inorder[i],i);
        }
        return build(inorder,postorder,0,n-1,inIdx);

    }
}