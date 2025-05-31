import java.util.LinkedList;
import java.util.Queue;

public class Tree{

    static int idx=-1;
    Node buildBinaryTree(int arr[]){
        idx++;
        if(arr[idx]==-1)return null;
        Node root=new Node(arr[idx]);
        root.left=buildBinaryTree(arr);
        root.right=buildBinaryTree(arr);
        return root;
    }

    void preorder(Node root){
        if(root==null)return;
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }

    void inorder(Node root){
        if(root==null)return;
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    void postorder(Node root){
        if(root==null)return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }
    //bfs
    void levelorder(Node root){
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        //use to track level of tree
        q.add(null);
        while (q.size()>0) {
            Node curr=q.remove();
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
}
