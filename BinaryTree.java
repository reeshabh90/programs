/**
 * BinaryTree
 */
public class BinaryTree {
    BinaryNode head;

    static class BinaryNode {
        int data;
        BinaryNode leftNode;
        BinaryNode rightNode;

        public BinaryNode(int data) {
            super();
            this.data = data;
            this.leftNode = null;
            this.rightNode = null;
        }
    }

    public void insert(int data) {
        BinaryNode newNode = new BinaryNode(data);
        if (this.head == null) {
            this.head = newNode;
        } else {
            if (this.head.data > data) {
                insertLeft(this.head, data);
            } else {
                insertRight(this.head, data);
            }
        }
    }

    public void insertLeft(BinaryNode node, int data) {
        BinaryNode newNode = new BinaryNode(data);
        if (node.leftNode == null) {
            node.leftNode = newNode;
        } else {
            if (node.leftNode.data > data) {
                insertLeft(node.leftNode, data);
            } else {
                insertRight(node.leftNode, data);
            }
        }
    }

    public void insertRight(BinaryNode node, int data) {
        BinaryNode newNode = new BinaryNode(data);
        if (node.rightNode == null) {
            node.rightNode = newNode;
        } else {
            if (node.rightNode.data > data) {
                insertLeft(node.rightNode, data);
            } else {
                insertRight(node.rightNode, data);
            }
        }
    }

    public BinaryNode searchKey(BinaryNode node, int data) {
        if (node == null || node.data == data) {
            return this.head;
        } else {
            if (this.head.data > data) {
                return searchKey(this.head.leftNode, data);
            } else {
                return searchKey(this.head.rightNode, data);
            }
        }
    }

    public void inorder() {
        inorderRec(this.head);
    }

    // A utility function to do inorder traversal of BST
    public void inorderRec(BinaryNode root) {
        if (root != null) {
            inorderRec(root.leftNode);
            System.out.println(root.data);
            inorderRec(root.rightNode);
        }
    }

    public static void main(String[] args) {
        BinaryTree bst = new BinaryTree();
        bst.insert(2);
        bst.insert(4);
        bst.insert(5);
        bst.insert(1);

        bst.inorder();
    }
}