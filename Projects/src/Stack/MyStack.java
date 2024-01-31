package Stack;

public class MyStack implements Stack {

    private final int[] stack;
    private int top;
    private final int size;

    public MyStack(int size) {
        this.size = size;
        stack = new int[size];
        top = -1;
    }

    @Override
    public void push(int x) {
        if (top == size - 1) {
            System.out.println("Stack is full");
        } else {
            stack[++top] = x;
        }
    }

    @Override
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            return stack[top--];
        }
    }

    @Override
    public Object top() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            return stack[top];
        }
    }

    @Override
    public Object topAndPop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            return stack[top--];
        }
    }

    @Override
    public boolean isEmpty() {
        return top == -1;
    }

    @Override
    public void printStack() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            for(int i = 0; i <= top; i++){
                System.out.print(stack[i] + " ");
            }
        }
    }
}
