package Module13.Insert_Element;

public class Serch_for_Key {
    int data;
    Node left, right;

    Serch_for_Key(int data) {
        this.data = data;
        left = right = null;
    }
}

 class BSTSearch {

    Node insert(Node root, int value) {
        if (root == null) return new Node(value);

        if (value < root.data)
            root.left = insert(root.left, value);
        else if (value > root.data)
            root.right = insert(root.right, value);

        return root;
    }

    boolean search(Node root, int key) {
        if (root == null) return false;

        if (root.data == key) return true;

        if (key < root.data)
            return search(root.left, key);
        else
            return search(root.right, key);
    }

    public static void main(String[] args) {
        BSTSearch tree = new BSTSearch();
        Node root = null;

        root = tree.insert(root, 50);
        root = tree.insert(root, 30);
        root = tree.insert(root, 70);
        root = tree.insert(root, 20);
        root = tree.insert(root, 40);

        int key = 40;

        if (tree.search(root, key))
            System.out.println("Key found");
        else
            System.out.println("Key not found");
    }
}

