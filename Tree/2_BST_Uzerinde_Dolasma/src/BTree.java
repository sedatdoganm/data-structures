public class BTree{
    Node root;

    public BTree(){
        root = null;
    }

    Node newNode(int data){
        root = new Node(data);
        return root;
    }

    Node insert(Node root, int data){
        if(root == null){
            root = newNode(data);
        }
        else{
            if(root.data<=data){
                root.right = insert(root.right, data);
            }
            else{
                root.left = insert(root.left, data);
            }
        }
        return root;
    }

    void preOrder(Node root){
        if(root != null){
            System.out.print(root.data+" ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    void inOrder(Node root){
        if(root != null){
            inOrder(root.left);
            System.out.print(root.data+" ");
            inOrder(root.right);
        }
    }

    void postOrder(Node root){
        if(root != null){
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + " ");
        }
    }

}