package Module12.Postorder;

public class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

 class PostorderTraversal {

    void postorder(Node root) {
        if (root == null) return;

        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }

    public static void main(String[] args) {
        PostorderTraversal t = new PostorderTraversal();

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);

        t.postorder(root);
    }
}

