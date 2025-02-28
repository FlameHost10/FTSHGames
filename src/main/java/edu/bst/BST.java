package edu.bst;



public class BST {
    public Node root;

    public BST() {
        root = null;
    }

    public void insert(int key) {
        root = insertRec(root, key);
    }

    public boolean search(int key) {
        return searchRec(root, key);
    }

    public int depth() {
        return depthRec(root);
    }

    public int maxHeightDifference() {
        int[] maxDiff = {0};
        computeMaxHeightDifference(root, maxDiff);
        return maxDiff[0];
    }

    private Node insertRec(Node root, int key) {
        if (root == null) {
            root = new Node(key);
            return root;
        }
        if (key < root.key) {
            root.left = insertRec(root.left, key);
        } else if (key > root.key) {
            root.right = insertRec(root.right, key);
        }
        return root;
    }


    private boolean searchRec(Node root, int key) {
        if (root == null) {
            return false;
        }
        if (root.key == key) {
            return true;
        }
        if (key < root.key) {
            return searchRec(root.left, key);
        } else {
            return searchRec(root.right, key);
        }
    }

    private int depthRec(Node node) {
        if (node == null) {
            return 0;
        }
        return 1 + Math.max(depthRec(node.left), depthRec(node.right));
    }

    private int computeMaxHeightDifference(Node node, int[] maxDiff) {
        if (node == null) {
            return 0;
        }
        int leftHeight = computeMaxHeightDifference(node.left, maxDiff);
        int rightHeight = computeMaxHeightDifference(node.right, maxDiff);
        int currentDiff = Math.abs(leftHeight - rightHeight);

        if (currentDiff > maxDiff[0]) {
            maxDiff[0] = currentDiff;
        }

        return 1 + Math.max(leftHeight, rightHeight);
    }
}