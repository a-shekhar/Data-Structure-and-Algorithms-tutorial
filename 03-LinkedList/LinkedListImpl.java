public class LinkedListImpl {

    private Node head;
    private Node tail;
    private int length;


    public LinkedListImpl(int data){
        this.head = new Node(data);
        this.tail = head;
        this.length = 1;
    }

    public void print(String methodName){
        System.out.println("-----" + methodName + "-----");
        Node current = this.head;
        while (current != null){
            System.out.print(current.data  + " ");
            current = current.next;
        }
        System.out.println();
    }

    public int getLength(){
        return this.length;
    }

    public void append(int data){
        Node curr = new Node(data);
        this.tail.next = curr;
        this.tail = curr;
        this.length++;
    }

    public void prepend(int data){
        Node node = new Node(data);
        node.next = this.head;
        this.head = node;
        length++;
    }

    public void insert(int index, int data){
        if(index < 0 || index > length){
            System.out.println("Please select index between 0 to " + this.length);
        }else if(index == 0){
            this.prepend(data);
        }else if(index == length){
            this.append(data);
        }else {
            Node prev = null;
            Node curr = this.head;
            Node temp = new Node(data);
            int i = 0;
            while(i != index){
                prev = curr;
                curr = curr.next;
                i++;
            }
            prev.next = temp;
            temp.next = curr;
            this.length++;
        }
    }

    public void insert2(int index, int data){
        if(index < 0 || index > length){
            System.out.println("Please select index between 0 to " + this.length);
        }else if(index == 0){
            this.prepend(data);
        }else if(index == length){
            this.append(data);
        }else {
            Node curr = this.head;
            Node temp = new Node(data);
            int i = 0;
            while(i < index - 1){
                curr = curr.next;
                i++;
            }
            temp.next = curr.next;
            curr.next = temp;
        }
        this.length++;
    }

    public void remove(int index){
        if(index < 0 || index >= length){
            System.out.println("Please select index between 0 to " + this.length);
        } else if (index == 0) {
            this.head = this.head.next;
            this.length--;
        }else {
            Node prev = null;
            Node curr = this.head;
            int i = 0;
            while (i != index) {
                prev = curr;
                curr = curr.next;
                i++;
            }
            if(curr != null) {
                prev.next = curr.next;
                curr.next = null;
            }else{
                prev = null;
            }
            this.length--;
        }
    }

    /*public void remove2(int index){
        if(index < 0 || index >= length){
            System.out.println("Please select index between 0 to " + this.length);
        } else if (index == 0) {
            this.head = this.head.next;
            this.length--;
        }else {
            Node curr = this.head;
            int i = 0;
            while (i < index - 1) {
                curr = curr.next;
                i++;
            }
            System.out.println(curr);
            //Node unwanted = curr.next;
            curr = curr.next.next;
           // System.out.println(unwanted);
            //curr = unwanted.next;
            System.out.println(curr);
           // unwanted.next = null;
            this.length--;
        }
    }*/

    public void reverse(){
        if(this.head.next != null){
            Node first = this.head;
            this.tail = this.head;
            Node second = first.next;
            while (second != null){
                Node temp = second.next;
                second.next = first;
                first = second;
                second = temp;
            }
            this.head.next = null;
            this.head = first;
        }
        this.print("Reverse");
    }
    public static void main(String[] args) {
        LinkedListImpl linkedList = new LinkedListImpl(10);

        linkedList.print("append");

        linkedList.append(5);
        linkedList.append(16);

        linkedList.print("prepend");

        linkedList.prepend(2);
        linkedList.prepend(1);
        linkedList.prepend(3);

        linkedList.print("insert");

        linkedList.insert(0,4);
        linkedList.insert(0,5);
        linkedList.insert(8,10);
        linkedList.insert(9,11);
        linkedList.insert(11,50);
        linkedList.insert(5,50);

        linkedList.print("insert2");

        linkedList.insert2(5, 120);

        linkedList.print("remove");

        linkedList.remove(1);
        linkedList.remove(2);
        linkedList.remove(3);
        linkedList.remove(0);
        linkedList.remove(8);
        linkedList.remove(7);

        linkedList.print("remove2");

        //linkedList.remove2(2);
        //linkedList.remove2(4);
        //linkedList.remove2(3);
        //linkedList.remove2(1);


        // print the contents of Linked List
        linkedList.print("Final Linked List");

        linkedList.reverse();

        // get the length of linkedList
        System.out.println("Length of Linked list is " + linkedList.getLength());
    }
}
