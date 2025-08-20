public class Main {
    public static void main(String[] args) {
        BTree bt = new BTree();

        bt.root = bt.insert(bt.root,10);
        bt.root = bt.insert(bt.root,7);
        bt.root = bt.insert(bt.root,20);
        bt.root = bt.insert(bt.root,30);

        System.out.println("Kök: "+bt.root.data);
        System.out.println("Kökün ilk solu: "+bt.root.left.data);
        System.out.println("Kokun ilk sagi: "+bt.root.right.data);
        System.out.println(bt.root.right.right.data);
    }
}