import javax.xml.transform.sax.SAXResult;

public class BSTree {
    Node root;

    public BSTree() {
        root = null;
    }

    Node newNode(int ogrenciNo, int ogrenciNot, String ogrenciAdi, String ogrenciSoyadi){
        root = new Node(ogrenciNo, ogrenciNot, ogrenciAdi, ogrenciSoyadi);
        return root;
    }

    Node insert(Node root, int ogrenciNo, int ogrenciNot, String ogrenciAdi, String ogrenciSoyadi){
        if(root!=null){
            if(ogrenciNo < root.ogrenciNo){
                root.left = insert(root.left, ogrenciNo, ogrenciNot, ogrenciAdi, ogrenciSoyadi);
            }
            else{
                root.right = insert(root.right, ogrenciNo, ogrenciNot, ogrenciAdi, ogrenciSoyadi);
            }
        }
        else {
            root = new Node(ogrenciNo, ogrenciNot, ogrenciAdi, ogrenciSoyadi);
        }
        return root;
    }

    Node inOrder(Node root){
        if(root != null){
            inOrder(root.left);
            System.out.println(root.ogrenciAdi +"\t"+root.ogrenciSoyadi+"\t"+ root.ogrenciNo+"\t"+root.ogrenciNot );
            inOrder(root.right);
        }
        return root;
    }

    Node delete(Node root, int ogrenciNo) {
        if(root == null){
            return null;
        }
        if(ogrenciNo < root.ogrenciNo)
        {
            root.left = delete(root.left, ogrenciNo);
        }
        else if(ogrenciNo > root.ogrenciNo){
            root.right = delete(root.right, ogrenciNo);
        }
        else{
            if(root.right == null && root.left == null){
                return null;
            }
            else if(root.right == null){
                return root.left;
            }
            else if(root.left == null){
                return root.right;
            }
            else{
                Node temp = root.right;
                Node temp2 = temp;

                while(temp2.left != null){
                    temp2 = temp2.left;
                }

                temp2.left = root.left;
                return temp;
            }
        }
        return root;
    }

}