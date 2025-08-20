public class Main {
    public static void main(String[] args) {
        BTree bst = new BTree();
        bst.root = bst.insert(bst.root, 10);
        bst.root = bst.insert(bst.root, 8);
        bst.root = bst.insert(bst.root, 15);
        bst.root = bst.insert(bst.root, 5);
        bst.root = bst.insert(bst.root, 12);
        bst.root = bst.insert(bst.root, 20);
        bst.root = bst.insert(bst.root, 9);

        System.out.println("PreOrder: ");
        bst.preOrder(bst.root);
        System.out.println("\n**************");
        System.out.println("InOrder: ");
        bst.inOrder(bst.root);
        System.out.println("\n**************");
        System.out.println("PostOrder: ");
        bst.postOrder(bst.root);
    }
}

/*
10, 8, 15, 5, 12, 20, 9

1. Preorder (Root → Left → Right)
Önce kökü yaz, sonra sol alt ağacı, sonra sağ alt ağacı.
10, 8, 5, 9, 15, 12, 20

2. Inorder (Left → Root → Right)
Önce sol alt ağacı, sonra kökü, sonra sağ alt ağacı.
5, 8, 9, 10, 12, 15, 20
Kısacası sayıları küçükten büyüğe sırala.

3. Postorder (Left → Right → Root)
Önce sol alt ağaç, sonra sağ alt ağaç, en son kök.
5, 9, 8, 12, 20, 15, 10

 */