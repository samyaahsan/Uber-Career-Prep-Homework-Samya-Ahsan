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

    public static void main(String[] args){
        part3 temp = new part3();
        myStack thisStack = temp.new myStack();
        thisStack.push(42);
        System.out.println("top of stack: " + thisStack.top());
        System.out.println("size of stack: " + thisStack.size());
        int popped_value = thisStack.pop();
        System.out.println("popped value: " + popped_value);
        System.out.println("size of stack: " + thisStack.size());
    }
}
