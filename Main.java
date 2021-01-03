import linkedList.SingularLinkedList;
import stack.ArrayStack;

public class Main {
    public static void main(String[] args){
        test_stack();
    }

    private static void test_linkedlist(){
        SingularLinkedList list = new SingularLinkedList();
        list.append(1);
        list.append(2);
        list.append(3);
        list.append(4);
        list.insert_after(5, 2);
        list.insert_after(10,0);
        System.out.println(list.toString());
        list.reverse();
        System.out.println(list.toString());        
    }

    public static void test_stack(){
        ArrayStack st = new ArrayStack();
        st.push(1);
        st.push(5);
        st.push(3);
        System.out.println(st.to_string());
        st.pop();
        st.pop();
        st.pop();
        System.out.println(st.to_string());
    }


}
