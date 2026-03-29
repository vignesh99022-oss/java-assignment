package Module12.Height;

public class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

 class HeightOfTree {

    int height(Node root) {
        if (root == null) return 0;

        int left = height(root.left);
        int right = height(root.right);

        return Math.max(left, right) + 1;
    }

    public static void main(String[] args) {
        HeightOfTree t = new HeightOfTree();

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);

        System.out.println("Height: " + t.height(root));
    }
}


