package Module13.Insert_Element;

public class Check_Binary_TreeValid {
    int data;
    Node left, right;

    Check_Binary_TreeValid(int data) {
        this.data = data;
        left = right = null;
    }
}

 class CheckValidBST {

    boolean isBST(Node root, int min, int max) {
        if (root == null) return true;

        if (root.data <= min || root.data >= max) {
            return false;
        }

        return isBST(root.left, min, root.data) &&
                isBST(root.right, root.data, max);
    }

    public static void main(String[] args) {
        CheckValidBST tree = new CheckValidBST();

        Node root = new Node(50);
        root.left = new Node(30);
        root.right = new Node(70);
        root.left.left = new Node(20);
        root.left.right = new Node(40);
        root.right.left = new Node(60);
        root.right.right = new Node(80);

        if (tree.isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE))
            System.out.println("Valid BST");
        else
            System.out.println("Not a BST");
    }
}

