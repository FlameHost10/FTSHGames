package edu.bst;

public class Main {
    public static void main(String[] args) {
        BST tree = new BST();
        tree.insert(5);
        tree.insert(3);
        tree.insert(7);
        tree.insert(6);
//        tree.insert(4);
        tree.insert(2);
        tree.insert(8);
        System.out.println("Глубина: " + tree.depth());
        System.out.println("Максимальная разница: " + tree.maxHeightDifference());

    }
}
