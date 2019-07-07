package stack;

public class StackUsingArray {
int array[]=new int[20];
int top=-1;

    public static void main(String args[])
    {
       new StackUsingArray().printStackElement();

    }

    public void add(int data)
    {
        top=top++;
        array[top]=data;
    }

    public void printStackElement() {
        if (top < 0) {
            System.out.println("Stack is Empty");
        } else {
            for (int i = top; i < 0; i++)
                System.out.println(array[i]);
        }
    }
    }
