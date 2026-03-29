package Module12.Count_Number;

public class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

class CountNodes {

    int count(Node root) {
        if (root == null) return 0;

        return 1 + count(root.left) + count(root.right);
    }

    public static void main(String[] args) {
        CountNodes t = new CountNodes();

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);

        System.out.println("Total Nodes: " + t.count(root));
    }

}
