import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class BFS {

        private BinaryNode root;

        public BFS(){
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

        public ArrayList<Integer> breadthFirstSearch(){
            BinaryNode currentNode = this.root;
            ArrayList<Integer> list = new ArrayList<>();
            ArrayList<BinaryNode> queue = new ArrayList<>();

            queue.add(currentNode);

            while (queue.size() > 0){
                currentNode = queue.remove(0);
                list.add(currentNode.data);
                if(currentNode.left != null){
                    queue.add(currentNode.left);
                }
                if(currentNode.right != null){
                    queue.add(currentNode.right);
                }
            }
            return list;
        }

    public ArrayList<Integer> breadthFirstSearchRecursive(
            ArrayList<BinaryNode> queue, ArrayList<Integer> list){
            if(queue.size() == 0){
                return list;
            }

            BinaryNode currentNode = queue.remove(0);
            list.add(currentNode.data);
            if(currentNode.left != null){
                queue.add(currentNode.left);
            }
            if(currentNode.right != null){
                queue.add(currentNode.right);
            }
        return this.breadthFirstSearchRecursive(queue, list);
    }

        @Override
        public String toString() {
            return "BinaryTree{" +
                    "root=" + root +
                    '}';
        }


        public static void main(String[] args) {
            BFS tree = new BFS();
            tree.append(9);
            tree.append(4);
            tree.append(6);
            tree.append(20);
            tree.append(170);
            tree.append(15);
            tree.append(1);

            System.out.println(tree.breadthFirstSearch());

            ArrayList<Integer> list = new ArrayList<>();
            ArrayList<BinaryNode> queue = new ArrayList<>();
            queue.add(tree.root);
            System.out.println(tree.breadthFirstSearchRecursive(queue, list));

        }
}
