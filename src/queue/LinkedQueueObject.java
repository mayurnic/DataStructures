package queue;

import linkedlist.LinkedList;
import linkedlist.LinkedListObject;

public class LinkedQueueObject {

    int length;
    LinkedListObject front,rear;

    public static void main (String args[])
    {
        LinkedQueueObject linkedQueue=new LinkedQueueObject();

        for(int i=0; i<10; i++)
        {
        linkedQueue.Enqueue(i);
        }

        linkedQueue.print();
        linkedQueue.Dequeue();

        linkedQueue.Dequeue();
linkedQueue.print();

    }

    public int  size()
    {
        int counter=0;
        LinkedListObject pointer=front;
        while(pointer!=null)
        {
            pointer=pointer.getNextNode();
            counter++;
        }
        return counter;
    }
    public void print()
    {
    front.printLinkedList(front);
    }
    public void Enqueue(Object data)
    {
        if(data==null)
        {}
        else if(rear==null && front==null)
        {
        rear=front=new LinkedListObject(data);
        }
        else {
            rear.setNextNode(new LinkedListObject(data));
            rear = rear.getNextNode();
        }
    }


    public Object Dequeue()
    {
        if(front==null)
        {
            System.out.println("Queue Is empty");
            return null;
        }
        else {
            LinkedListObject temp=front;
            if(front.getNextNode()!=null)
            front = front.getNextNode();
            else {
                front = null;
                rear=null;
            }
            return temp;
        }
    }


    public boolean isEmpty()
    {
        if(front==null)
        return true;
    else
        return false;
    }


}
