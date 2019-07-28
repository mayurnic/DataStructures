package stack;

import linkedlist.LinkedListObject;

public class StackUsingLinkedList {

    int length;
    LinkedListObject top=null;
    public static void main(String args[])
    {
        StackUsingLinkedList stack=new StackUsingLinkedList();
        stack.push(1);
        stack.push(2);
        stack.push(2);

        stack.print();
    }


    public void push(Object data)
    {
        if(top==null) {
            top=new LinkedListObject();
            top.data=data;
        }
        else {
            LinkedListObject obj=new LinkedListObject();
            obj.setData(data);
            top=obj.setNextNode(top);
        }
        }

    public LinkedListObject pop()
    {
        LinkedListObject temp=top;
        top=top.nextNode;
        return temp;

    }

    public boolean isEmpty()
    {
        if(top==null)
            return true;

        return false;
    }

    public void print()
    {
        LinkedListObject pointer=top;
        while(pointer!=null)
        {
            System.out.println(pointer.data);
            pointer=pointer.nextNode;
        }
    }



}



class LinkedList
{

    public LinkedList next;
    public Object data;

    public LinkedList(Object data)
    {
        next=null;
        this.data=data;
    }

public Object getData(LinkedList node)
{
    return node.data;
}
   public LinkedList setNextNode(LinkedList next)
    {
        this.next=next;
        return this;

    }
    public LinkedList getNextNode()
    {
        return this.next;
    }

    public void addNode(Object data)
    {
        this.next=new LinkedList(data);
    }




}
