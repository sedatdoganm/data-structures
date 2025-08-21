public class Main {
    public static void main(String[] args) {
        BSTree bsTree = new BSTree();
        bsTree.root = bsTree.insert(bsTree.root, 10);
        bsTree.root = bsTree.insert(bsTree.root, 8);
        bsTree.root = bsTree.insert(bsTree.root, 15);
        bsTree.root = bsTree.insert(bsTree.root, 5);
        bsTree.root = bsTree.insert(bsTree.root, 12);
        bsTree.root = bsTree.insert(bsTree.root, 20);
        bsTree.root = bsTree.insert(bsTree.root, 9);

        bsTree.inOrder(bsTree.root);
        System.out.println();
        bsTree.root = bsTree.delete(bsTree.root, 15);
        bsTree.inOrder(bsTree.root);


    }
}