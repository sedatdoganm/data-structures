public class BSTree {
    Node root;

    public BSTree(){
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
            if(root.data>data){
                root.left = insert(root.left, data);
            }
            else{
                root.right = insert(root.right, data);
            }
        }
        return root;
    }

    void preOrder(Node root){
        if(root!=null){
            System.out.print(root.data+ " ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    void inOrder(Node root){
        if(root!=null){
            inOrder(root.left);
            System.out.print(root.data+ " ");
            inOrder(root.right);
        }
    }

    void postOrder(Node root){
        if(root!=null){
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data+ " ");
        }
    }

    int height(Node root){
        if(root == null){
            return -1;
        }
        else{
            int left = 0;
            int right = 0;

            left = height(root.left);
            right = height(root.right);

            if(left>right){
                return left + 1;
            }
            else{
                return right + 1;
            }
        }
    }
    int depth(Node root){
        return height(root) +1;
    }

    int size(Node root){
        if(root == null){
            return 0;
        }
        else{
            return size(root.left) + size(root.right) + 1;
        }
    }
}
