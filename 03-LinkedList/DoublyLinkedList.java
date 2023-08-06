public class DoublyLinkedList {

    private DoublyNode head;

    private int length;

    private DoublyNode tail;

    public DoublyLinkedList(int data){
        this.head = new DoublyNode(data);
        this.tail = this.head;
        this.length = 1;
    }

    public void print(){
        DoublyNode current = this.head;
        while (current != null){
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println("Length " + this.length);
    }

    public void prepend(int data){
        DoublyNode newNode = new DoublyNode(data);
        this.head.prev = newNode;
        newNode.next = this.head;
        this.head = newNode;
        this.length++;
        this.print();
    }

    public void append(int data){
        DoublyNode newNode = new DoublyNode(data);
        this.tail.next = newNode;
        this.tail = newNode;
        this.length++;
        //System.out.println(this.head);
        this.print();
    }

    public void insert(int index, int data){
        if(index < 0 || index > length){
            System.out.println("Please select index between 0 to " + this.length);
        }else if(index == 0){
            this.prepend(data);
        }else if(index == length){
            this.append(data);
        }else {
            DoublyNode newNode = new DoublyNode(data);
            DoublyNode prev = null;
            DoublyNode curr = this.head;
            int i = 0;
            while(i < index){
                prev = curr;
                curr = curr.next;
                i++;
            }

            prev.next = newNode;
            newNode.prev = prev;
            newNode.next= curr;
            curr.prev = newNode;
            this.length++;
            this.print();
        }
    }


    public void remove(int index){
        if(index < 0 || index > length){
            System.out.println("Please select index between 0 to " + this.length);
        }
            DoublyNode prev = null;
            DoublyNode curr = this.head;
            int i = 0;
            while(i < index){
                prev = curr;
                curr = curr.next;
                i++;
            }

            DoublyNode unwanted = curr;
            prev.next = unwanted.next;
            unwanted.next.prev = prev;
            this.length--;
            this.print();
    }

    public void printInReverse(){
        DoublyNode current = this.tail;
        while (current != null){
            System.out.print(current.data + " ");
            current = current.prev;
        }
        System.out.println("Length " + this.length);
    }

    public static void main(String[] args) {
        DoublyLinkedList doubly = new DoublyLinkedList(1);
        doubly.print();

        doubly.prepend(0);
        doubly.prepend(-1);

        doubly.append(2);
        doubly.append(3);

        doubly.insert(1, 10);
        doubly.insert(3, 14);
        doubly.insert(6, 16);

        doubly.remove(1);
        doubly.remove(2);
        doubly.remove(4);

        doubly.printInReverse();
    }


}
