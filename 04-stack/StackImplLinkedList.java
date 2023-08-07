public class StackImplLinkedList {
    int length = 0;
    Node top;
    Node bottom;

    public StackImplLinkedList(String data){
        Node node = new Node(data);
        this.bottom = node;
        this.top = node;
        this.length = 1;
    }

    private int getSize(){
        return this.length;
    }



    private void print(){
        Node curr = this.top;
        while(curr != null){
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    private void peek(){
        System.out.println(this.top.data);
    }

    private void push(Object data){
        Node newNode = new Node(data);
        if(this.length == 0){
            this.top = newNode;
            this.bottom = newNode;
        }
        newNode.next = this.top;
        this.top = newNode;
        this.length++;
        this.print();
    }

    private void pop(){
        if(this.length != 0) {
            System.out.println("nodeToBeRemoved: " + this.top.data);
            this.top = this.top.next;
            this.length--;
            if(this.length == 0){
                this.bottom = null;
            }
        }
        this.print();
    }

    public static void main(String[] args) {
        StackImplLinkedList stack  = new StackImplLinkedList("Geeks");


        stack.push("YouTube");
        stack.push("google");

        stack.peek();

        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();

        System.out.println(stack.getSize());
    }
}
