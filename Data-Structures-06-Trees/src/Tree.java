public class Tree {

    //Nested Node Class

    private class Node{
        private Node leftChild;
        private Node rightChild;
        private int value;

        public Node (int value){
            this.value=value;
        }
    }

    private Node root;

    //My Insert Method for BST
    public void insert(int value){
        Node node = new Node(value);

        //checking if tree is empty
        if(root==null) {
            root=node;
            return;
        }
        //if tree is not empty
        Node current = root;
            while(true){
            //check if it is less
                if(value<current.value){
                    if(current.leftChild==null){
                        current.leftChild=node;
                        break;
                    }
                    current = current.leftChild;
                }else{
                    if(current.rightChild==null){
                        current.rightChild=node;
                        break;
                    }
                    current = current.rightChild;
                }
        }

    }

    //Pre-order Root-Left-Right
    public void traversePreOrder(){
        traversePreOrder(root);
    }
    private void traversePreOrder(Node root){
        if(root==null) return;
            System.out.println(root.value + ",");
            traversePreOrder(root.leftChild);
            traversePreOrder(root.rightChild);

    }

    //In Order Left-Root-Right
    void traverseInOrder(){
        traverseInOrder(root);
    }
    private void traverseInOrder(Node root){
        if(root==null) return;
            traverseInOrder(root.leftChild);
            traverseInOrder(root.rightChild);
            System.out.println(root.value + ",");


    }

    //post order
    void traversePostOrder(){
        traversePostOrder(root);
    }
    private void traversePostOrder(Node root){
            if(root==null) return;
            traversePostOrder(root.leftChild);
            traversePostOrder(root.rightChild);
            System.out.println(root.value + ",");


    }


}
