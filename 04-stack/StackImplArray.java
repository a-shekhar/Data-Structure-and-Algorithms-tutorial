import java.util.Arrays;

public class StackImplArray {

    int length = 100;

    Object[] stack = new Object[length];

    int top = -1;

    public StackImplArray(Object data){
        top++;
        stack[top] = data;
    }

    private void print(){
        System.out.println(Arrays.toString(stack));
    }

    private void peek(){
        System.out.println(stack[top]);
    }

    private void push(Object data){
        if(top >= length){
            System.out.println("Stack Overflow");
        }else{
            top++;
            stack[top] = data;
        }
        this.print();
    }

    private void pop(){
        if(top < 0){
            System.out.println("Stack underflow");
        }else{
            System.out.println("Removed data is " + stack[top]);
            stack[top] = null;
            top--;
        }
        this.print();
    }


    public static void main(String[] args) {
        StackImplArray stack = new StackImplArray("Stack");
        stack.push("Youtube");
        stack.push("Google");
        stack.peek();

        stack.peek();
        stack.pop();
        stack.pop();

        stack.push("FaceBook");
        stack.peek();
        stack.push(("Insta"));
        stack.pop();

    }
}
