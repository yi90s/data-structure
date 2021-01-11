package stack;

public class LinkedListStack implements Stack{

    private Node top;

    class Node{
        int data;
        Node next;
        public Node(int x, Node next){
            this.data = x;
            this.next = next;
        }
    }

    public LinkedListStack(){
        this.top = null;
    }


    public void push(int x) {
        if(top == null){
            top = new Node(x, null);
        }else{
            Node tmp = new Node(x, top);
            tmp.next = top;
            top = tmp;
        }

    }

    public int peek() {
        if(top == null){
            System.out.println("\nEmpty Stack");
            return -1;
        }

        return top.data;
    }

    public int pop() {
        if(top == null){
            System.out.println("\n");
            return -1;
        }else{
            
        }
    }

    public String toString() {
        // TODO Auto-generated method stub
        return null;
    }

    
    
}

