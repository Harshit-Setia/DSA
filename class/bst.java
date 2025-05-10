public class bst {
    // Node class for the binary search tree
    static class Node {
        int data;
        Node left, right;

        Node(int item) {
            data = item;
            left = right = null;
        }
    }
    public Node root;
    public bst() {
        root = null;
    }
    // Function to insert a new node with given val
    Node insert(Node node, int val) {
        if (node == null) {
            return new Node(val);
        }

        if (val < node.data) {
            node.left = insert(node.left, val);
        } else if (val > node.data) {
            node.right = insert(node.right, val);
        }

        return node;
    }

    Node delNode(Node root, int val) {
        if (root == null) {
            return root;
        }

        if (val < root.data) {
            root.left = delNode(root.left, val);
        } else if (val > root.data) {
            root.right = delNode(root.right, val);
        } else {
            // Node with only one child or no child
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            // Node with two children: Get the inorder successor (smallest in the right subtree)
            root.data = minValue(root.right);

            // Delete the inorder successor
            root.right = delNode(root.right, root.data);
        }
        return root;
    }
    int minValue(Node root) {
        int minv = root.data;
        while (root.left != null) {
            minv = root.left.data;
            root = root.left;
        }
        return minv;
    }
    // Function to perform inorder traversal of the tree
    void inorder(Node node) {
        if (node == null) {
            return;
        }
        inorder(node.left);
        System.out.print(node.data + " ");
        inorder(node.right);
    }
    void printTree(Node root, String prefix, boolean isLeft) {
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
        bst tree = new bst();
        tree.root = tree.insert(tree.root, 50);
        tree.root = tree.insert(tree.root, 30);
        tree.root = tree.insert(tree.root, 40);
        tree.root = tree.insert(tree.root, 20);
        tree.root = tree.insert(tree.root, 60);

        tree.printTree();
        System.out.println();
    }
}
