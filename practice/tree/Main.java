public class Main {  
    public static void main(String[] args) {
        Tree t1=new Tree();
        int arr[]={1,2,-1,-1,3,4,-1,-1,5,-1,-1};
        
        TreeNode root=t1.buildBinaryTree(arr);
        // t1.preorder(root);
        // System.out.println();
        // t1.inorder(root);
        // System.out.println();
        // t1.postorder(root);
        // System.out.println();
        t1.levelorder(root);
        // System.out.println(t1.heightOfTree(root));
        // System.out.println(t1.nodeCnt(root));
        // System.out.println(t1.sumOfNodes(root));
    }

}