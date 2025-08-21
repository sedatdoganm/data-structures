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
        // bsTree.root = bsTree.insert(bsTree.root, 72);

        bsTree.preOrder(bsTree.root);
        System.out.println();
        bsTree.inOrder(bsTree.root);
        System.out.println();
        bsTree.postOrder(bsTree.root);

        int yukseklik = bsTree.height(bsTree.root);
        System.out.println("\nYukseklik: "+yukseklik);
        System.out.println("Derinlik: "+bsTree.depth(bsTree.root));
        System.out.println("\nEleman sayisi: "+bsTree.size(bsTree.root));
    }
}

