package Module13.Insert_Element;

public class Deleted_Node {
    int data;
    Node left, right;

    Deleted_Node(int data) {
        this.data = data;
        left = right = null;
    }
}

 class BSTDelete {

    Node insert(Node root, int value) {
        if (root == null) return new Node(value);

        if (value < root.data)
            root.left = insert(root.left, value);
        else if (value > root.data)
            root.right = insert(root.right, value);

        return root;
    }

    Node delete(Node root, int key) {
        if (root == null) return null;

        if (key < root.data) {
            root.left = delete(root.left, key);
        } else if (key > root.data) {
            root.right = delete(root.right, key);
        } else {
            if (root.left == null && root.right == null) {
                return null;
            }

            if (root.left == null) {
                return root.right;
            }

            if (root.right == null) {
                return root.left;
            }

            Node minNode = findMinNode(root.right);
            root.data = minNode.data;
            root.right = delete(root.right, minNode.data);
        }

        return root;
    }

    Node findMinNode(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    void inorder(Node root) {
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        BSTDelete tree = new BSTDelete();
        Node root = null;

        root = tree.insert(root, 50);
        root = tree.insert(root, 30);
        root = tree.insert(root, 70);
        root = tree.insert(root, 20);
        root = tree.insert(root, 40);
        root = tree.insert(root, 60);
        root = tree.insert(root, 80);

        System.out.print("Before deletion: ");
        tree.inorder(root);

        root = tree.delete(root, 30);

        System.out.print("\nAfter deletion: ");
        tree.inorder(root);
    }
}

