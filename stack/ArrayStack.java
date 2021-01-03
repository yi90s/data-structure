package stack;

public class ArrayStack implements Stack{
    final static int MAX_SIZE = 1000;
    private int top = -1;
    private int arr[] = null;

    public ArrayStack(){
        this.arr = new int[MAX_SIZE];
    }


    public void push(int a){
        if(this.is_full()){
            return; 
        }

        this.arr[++top] = a;
    }

    public int pop(){
        if(this.is_empty()){
            System.out.println(this+"is empty");
            return -1;
        }

        return arr[top--];
    }

    public int peek(){
        if(top < 0){
            return -1;
        }
        
        return arr[top];
    }

    public boolean is_empty(){
        return this.top == -1;
    }

    public boolean is_full(){
        return this.top >= MAX_SIZE-1;
    }

    public String to_string(){
        String str = "";
        for(int i=0; i<=top; i++){
            str += "("+String.valueOf(arr[i])+")";
            if(i != top){
                str += "-->";
            }
        }

        str += "(top)";
        return str;
    }
}
