package linkedList;

public class SingularLinkedList {

    class Node{
        int value;
        Node next; 
    
        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }

    private Node head;
    private int length;

    public SingularLinkedList(){
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

        this.length++; 
    }

    public void push(int data){
        
        if(head == null){ //append the first node in the list
            this.head = new Node(data, null);
        }else{
            Node new_node = new Node(data, head);
            this.head = new_node;
        }

        this.length++;
    }



    public void insertAfter(int data, int index){
        if(index > this.length-1){
            return;
        }

        if(index == 0){
            this.head = new Node(data, head);
        }else{
            Node cur_node = head;
            int count = 0;
            
            while(count != index){
                cur_node = cur_node.next;
                count++;
            }

            Node new_node = new Node(data, cur_node.next);
            cur_node.next = new_node;
        }

        this.length++;
    }

    public void deleteAt(int index){
        if(index > this.length -1){
            return;
        }
        
        if(index == 0){
            Node new_head = head.next;
            this.head = new_head;
        }else if(index > 0){
            int count = 0;
            Node prev_node = head, cur_node = head;

            while(count != index){
                prev_node = cur_node;
                cur_node = cur_node.next;
                count++;
            }
            
            prev_node.next = cur_node.next;
        }

        this.length--;
    }


    //TODO
    public void swap(int x, int y){
        if(length < 2){
            return;
        }

        
        //check if both x and y exist in the list

    }
    
    
    public int indexOf(int value){
        if(this.isEmpty()){
            return -1;
        }
        
        int index = -1;
        int count = 0;
        Node cur_node = this.head;

        while(cur_node != null){
            if(cur_node.value == value){
                index = count;
                break;
            }
            count++;
            cur_node = cur_node.next;
        }
        
        return index;
    }

    public int size(){
        return this.length;
    }


    public boolean isEmpty(){
        return this.length == 0;
    }

    // time complexity O(2n)
    public void reverse(){
        if(this.length < 2){
            return;
        }

        
        Node[] stack = new Node[this.length];
        Node cur_node = head;
        for(int i = 0; i < this.length; i++){
            stack[i] = cur_node;
            cur_node = cur_node.next;
        }

        this.reset();
        for(int i = stack.length -1; i >= 0; i--){
            this.append(stack[i].value);
        }

    }

    public void reset(){
        this.head = null;
        this.length = 0;
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
