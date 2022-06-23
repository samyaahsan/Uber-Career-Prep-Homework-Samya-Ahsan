import java.util.List;
import java.util.*;

public class part3 {
    public class myStack{
        //instance variables
        List<Integer> stack;
        int top;

        //constructor
        public myStack(){
            stack = new ArrayList<>();
        }
        /* 
        public Stack(varType){

        }
        */

        //methods
        public void push(int num){
            stack.add(num);
        }

        public int pop(){
            int removeThis = stack.get(stack.size()-1);
            stack.remove(stack.size()-1);
            return removeThis;
        }

        public int top(){
            return stack.get(stack.size()-1);
        }

        public boolean isEmpty(){
            return (stack.size() > 0);
        }

        public int size(){
            return stack.size();
        }
    }


    public class myQueue{
        List<Integer> q;

        public myQueue(){
            q = new LinkedList();
        }

        //enqueue
        public void enqueue(Integer data){
            q.add(data);
        }

        public Integer dequeue(){
            if (!q.isEmpty()){
                return q.remove(0);
            } 
            return null;      
        }

        public Integer rear(){
            return q.get(q.size()-1);
        }

        public Integer front(){
            return q.get(0);
        }

        public Integer size(){
            return this.q.size();
        }

        public boolean isEmpty(){
            return (q.isEmpty());
        }

    }

    public static void main(String[] args){

        part3 temp2 = new part3();
        myQueue q = temp2.new myQueue();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        System.out.println("size of queue: " + q.size());
        System.out.println("front of queue: " + q.front());
        System.out.println("rear of queue: " + q.rear());
        Integer dq = q.dequeue();
        System.out.println("dequeue item: " + dq);


        part3 temp = new part3();
        myStack thisStack = temp.new myStack();
        thisStack.push(42);
        System.out.println("top of stack: " + thisStack.top());
        System.out.println("size of stack: " + thisStack.size());
        int popped_value = thisStack.pop();
        System.out.println("popped value: " + popped_value);
        System.out.println("size of stack: " + thisStack.size());

        //queue
        
    }
}
