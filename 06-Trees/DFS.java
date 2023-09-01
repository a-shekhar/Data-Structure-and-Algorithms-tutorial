import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class DFS {

    private BinaryNode root;

    public DFS(){
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

    public ArrayList<Integer> inOrder(){
        return this.transverseInorder(this.root, new ArrayList<>());
    }

    private ArrayList<Integer> transverseInorder(BinaryNode root, ArrayList<Integer> list) {
            if(root == null){
                return list;
            }
            transverseInorder(root.left, list);
            list.add(root.data);
            transverseInorder(root.right, list);
            return list;
    }


    public ArrayList<Integer> preOrder(){
        return this.transversePreorder(this.root, new ArrayList<>());
    }

    private ArrayList<Integer> transversePreorder(BinaryNode root, ArrayList<Integer> list) {
        if(root == null){
            return list;
        }
        list.add(root.data);
        transversePreorder(root.left, list);
        transversePreorder(root.right, list);
        return list;
    }


    public ArrayList<Integer> postOrder(){
        return this.transversePostorder(this.root, new ArrayList<>());
    }

    private ArrayList<Integer> transversePostorder(BinaryNode root, ArrayList<Integer> list) {
        if(root == null){
            return list;
        }
        transversePostorder(root.left, list);
        transversePostorder(root.right, list);
        list.add(root.data);
        return list;
    }




    public static void main(String[] args) {
        DFS tree = new DFS();
        tree.append(9);
        tree.append(4);
        tree.append(6);
        tree.append(20);
        tree.append(170);
        tree.append(15);
        tree.append(1);

        System.out.println(tree.inOrder());
        System.out.println(tree.preOrder());
        System.out.println(tree.postOrder());

    }
}
