import java.util.LinkedList;
import java.util.Queue;

public class Tree{

    static int idx=-1;

    //building tree using preorder
    TreeNode buildBinaryTree(int arr[]){
        idx++;
        if(arr[idx]==-1)return null;
        TreeNode root=new TreeNode(arr[idx]);
        root.left=buildBinaryTree(arr);
        root.right=buildBinaryTree(arr);
        return root;
    }

    void preorder(TreeNode root){
        if(root==null)return;
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }

    void inorder(TreeNode root){
        if(root==null)return;
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    void postorder(TreeNode root){
        if(root==null)return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }

    //bfs
    void levelorder(TreeNode root){
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        //use to track level of tree
        q.add(null);
        while (q.size()>0) {
            TreeNode curr=q.remove();
            if(curr==null){
                if(!q.isEmpty()){
                    System.out.println();
                    q.add(null);
                    continue;
                }
                else{
                    break;
                }
            }
            else System.out.print(curr.data+" ");
            if(curr.left!=null){
                q.add(curr.left);
            }
            if(curr.right!=null){
                q.add(curr.right);
            }
        }
        System.out.println();
    }

    //height of tree
    int heightOfTree(TreeNode root){
        if(root==null)return 0;
        return Math.max(heightOfTree(root.left),heightOfTree(root.right))+1;
    }

    //number of Treenodes in tree 
    int TreenodeCnt(TreeNode root){
        if(root==null)return 0;
        return TreenodeCnt(root.left)+TreenodeCnt(root.right)+1;
    }

    //sum of all Treenodes
    int sumOfTreeNodes(TreeNode root){
        int sum=0;
        if(root==null)return 0;
        sum+=root.data;
        sum+=sumOfTreeNodes(root.left);
        sum+=sumOfTreeNodes(root.right);
        return sum;
    }
}
