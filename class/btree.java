class Node {
    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}
public class btree {

    Node root;

    // Function to insert a new node with given key
    Node insert(Node node, int key) {
        if (node == null) {
            return new Node(key);
        }

        if (key < node.data) {
            node.left = insert(node.left, key);
        } else if (key > node.data) {
            node.right = insert(node.right, key);
        }

        return node;
    }
    void inorder(Node node) {
        if (node == null) {
            return;
        }
        inorder(node.left);
        System.out.print(node.data + " ");
        inorder(node.right);
    }
    public void printTree(Node root, String prefix, boolean isLeft) {
        if (root != null) {
            System.out.print(prefix + (isLeft ? "├── " : "└── ") + root.data + "\n");
            printTree(root.left, prefix + (isLeft ? "│   " : "    "), true);
            printTree(root.right, prefix + (isLeft ? "│   " : "    "), false);
        }
    }
    public void printTree() {
        printTree(root, "", false);
    }

    public static void main(String[] args) {
        btree tree = new btree();
        Node root = null;
        root = tree.insert(root, 50);
        root.left = new Node(30);
        root.right = new Node(70);
        root.left.left = new Node(20);  
        root.left.right = new Node(40);
        System.out.println("Inorder traversal of the given tree:");
        tree.inorder(root);

        System.out.println();
        System.out.println("Tree structure:");
        tree.printTree(root, "", false);
    }
}
