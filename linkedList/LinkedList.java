package linkedList;

public class LinkedList {
    private Node head;
    private int length;

    public LinkedList(){
        this.head = null;
        this.length = 0;
    }

    public void append(int data){
        if(head == null){
            this.head = new Node(data, null);
        }else{ //traverse to the last node
            Node cur_node = head;
            while(cur_node.next != null){
                cur_node = cur_node.next;
            }

            cur_node.next = new Node(data, null); //append the new node
        }
    }

    public void push(int data){
        
        if(head == null){ //append the first node in the list
            this.head = new Node(data, null);
        }else{
            Node new_node = new Node(data, head);
            this.head = new_node;
        }
    }



    public void insert(int data, int index){

    }

    public void delete_at(int index){

    }

    public void delete(int key){
        
    }

    public String toString(){
        if(head == null){
            return "The list has no node"; 
        }

        String out = "";
        Node cur_node = head;

        while(cur_node != null){
            out += "(" + String.valueOf(cur_node.value) + ")" + " --> ";
            cur_node = cur_node.next;
        }

        return out;
    }
    
}

class Node{
    public int value;
    public Node next; 

    public Node(int value, Node next){
        this.value = value;
        this.next = next;
    }
}