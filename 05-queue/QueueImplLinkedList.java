public class QueueImplLinkedList {
    Node first = null;
    Node last = null;
    int length  = 0;

    public QueueImplLinkedList(Object data){
        Node node = new Node(data);
        this.first = node;
        this.last = this.first;
        this.length = 1;
    }

    private void print(){
        Node curr = this.first;
        while(curr != null){
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    private void peek(){
        System.out.println(this.first.data);
    }

    private void enqueue(Object data){
        Node newNode = new Node(data);
        if(this.length == 0){
            this.first = newNode;
            this.last = newNode;
        }else {
            this.last.next = newNode;
            this.last = newNode;
        }
        this.length++;
        this.print();
    }

    private void dequeue(){
        System.out.println("Node To be remove is " + this.first);
        this.first = this.first.next;
        this.length--;
        if(length == 0){
            this.first = null;
            this.last = null;
        } else if (length == 1) {
          this.last = this.first;
        }
        this.print();
    }
    public static void main(String[] args) {
        QueueImplLinkedList queue = new QueueImplLinkedList("Aditya");
        queue.print();
        queue.peek();

        queue.enqueue("Raj");
        queue.enqueue("Shekhar");

        queue.dequeue();
        queue.dequeue();

        queue.enqueue("Joey");
        queue.enqueue("Sharma");

        queue.dequeue();
    }
}
