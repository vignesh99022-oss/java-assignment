package Module13.Insert_Element;

public class MiniMum_Maximum {
    int data;
    Node left, right;

    MiniMum_Maximum(int data) {
        this.data = data;
        left = right = null;
    }
}

 class BSTMinMax {

    Node insert(Node root, int value) {
        if (root == null) return new Node(value);

        if (value < root.data)
            root.left = insert(root.left, value);
        else if (value > root.data)
            root.right = insert(root.right, value);

        return root;
    }

    int findMin(Node root) {
        if (root == null) {
            System.out.println("Tree is empty");
            return -1;
        }

        while (root.left != null) {
            root = root.left;
        }
        return root.data;
    }

    int findMax(Node root) {
        if (root == null) {
            System.out.println("Tree is empty");
            return -1;
        }

        while (root.right != null) {
            root = root.right;
        }
        return root.data;
    }

    public static void main(String[] args) {
        BSTMinMax tree = new BSTMinMax();
        Node root = null;

        root = tree.insert(root, 50);
        root = tree.insert(root, 30);
        root = tree.insert(root, 70);
        root = tree.insert(root, 20);
        root = tree.insert(root, 40);
        root = tree.insert(root, 60);
        root = tree.insert(root, 80);

        System.out.println("Minimum: " + tree.findMin(root));
        System.out.println("Maximum: " + tree.findMax(root));
    }
}

