package stack;

public class BalanceSymbolUsingStack {

    int length;
    LinkedListChar top=null;
    static BalanceSymbolUsingStack stack;

    public static void main(String args[])
    {
        stack=new BalanceSymbolUsingStack();


        System.out.println(stack.verifyBalanceExpression("{(())}"));
        stack.print();
    }

    private boolean verifyBalanceExpression(String expression) {
        char[]charArray=expression.toCharArray();
        for(char temp:charArray)
        {
            if(top==null)
            stack.push(temp);
            else
            {

            }

        }

        return false;
    }

    void push(char data)
    {
        if(top==null) {
            top=new LinkedListChar(data);
        }
        else
            top=new LinkedListChar(data).setNextNode(top);
    }

    void pop()
    {

    }

    void print()
    {
        LinkedListChar pointer=top;
        while(pointer!=null)
        {
            System.out.println(pointer.data);
            pointer=pointer.next;
        }
    }
}

    class LinkedListChar
    {

        LinkedListChar next;
        char data;

        LinkedListChar(char data)
        {
            next=null;
            this.data=data;
        }


        LinkedListChar setNextNode(LinkedListChar next)
        {
            this.next=next;
            return this;

        }
        LinkedListChar getNextNode()
        {
            return this.next;
        }

        void addNode(char data)
        {
            this.next=new LinkedListChar(data);
        }




    }
