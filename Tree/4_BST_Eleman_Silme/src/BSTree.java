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

    Node preOrder(Node root){
        if(root!=null){
            System.out.print(root.data +" ");
            preOrder(root.left);
            preOrder(root.right);
        }
        return root;
    }

    Node inOrder(Node root){
        if(root != null){
            inOrder(root.left);
            System.out.print(root.data +" ");
            inOrder(root.right);
        }
        return root;
    }

    Node postOrder(Node root){
        if(root != null){
            System.out.print(root.data +" ");
            postOrder(root.left);
            postOrder(root.right);
        }
        return root;
    }

    Node delete(Node root, int data){
        Node t1, t2;
        if(root == null){
            return null;
        }
        if(root.data == data){
            if(root.left == root.right) // silinecek dugumun altinda baska dugum yoktur
            {
                root = null;
                return null;
            }
            else if(root.left == null){
                t1 = root.right;
                return t1;
            }
            else if(root.right == null){
                t1 = root.right;
                return t1;
            }
            else{
                t1 = t2 = root.right;
                while(t1.left != null){
                    t1 = t1.left;
                }
                t1.left = root.left;
                return t2;
            }

        }
        else{
            if(data < root.data){
                root.left = delete(root.left, data);
            }
            else{
                root.right = delete(root.right, data);
            }
        }
        return root;
    }
}
