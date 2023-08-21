public class BinaryTree {

    private BinaryNode root;

    public BinaryTree(){
        this.root = null;
    }

    private void append(int data){
        BinaryNode newNode = new BinaryNode(data);
        if(root == null){
            root = newNode;
        }else{
            BinaryNode currentNode = this.root;
            while(true){
                if(data < currentNode.data){
                    // left
                    if(currentNode.left  == null){
                        currentNode.left = newNode;
                        return;
                    }
                    currentNode = currentNode.left;
                }else{
                    // right
                    if(currentNode.right == null){
                        currentNode.right = newNode;
                        return;
                    }
                    currentNode = currentNode.right;
                }
                System.out.println(currentNode);
            }
        }
        return;
    }

    @Override
    public String toString() {
        return "BinaryTree{" +
                "root=" + root +
                '}';
    }

    public String lookup(int value){
        if(root == null){
            return "root is empty";
        }
        BinaryNode currNode = this.root;
        while (currNode != null){
            if (currNode.data > value) {
                currNode = currNode.left;
            }else if (value > currNode.data){
                currNode = currNode.right;
            }else {
                return "Found: " + currNode.toString();
            }
        }
        return "Not Found";
    }

    public static void printNodes(BinaryNode node) {
       if (node == null) {
           return;
       }
       System.out.printf("%d ", node.data);
        printNodes(node.left);
        printNodes(node.right); }

     private void print(){
         printNodes(root);
         System.out.println();
         System.out.println(this);
     }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.append(9);
        tree.append(4);
        tree.append(6);
        tree.append(20);
        tree.append(170);
        tree.append(15);
        tree.append(1);

        System.out.println(tree.lookup(9));
        System.out.println(tree.lookup(19));
        System.out.println(tree.lookup(170));


        tree.print();
    }
}
