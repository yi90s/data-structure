package linkedList;

public class DoublyLinkedList {

    private Node head;
    
    class Node{
        int data;
        Node prev;
        Node next;

        public Node(int data, Node prev, Node next){
            this.data = data;
            this.prev = prev;
            this.next = next;
        }
    }

    public DoublyLinkedList(){
        this.head = null;
    }

    public void push(int x){
        Node newNode = new Node(x, null, null);
        
    }

}
