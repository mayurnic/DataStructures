package queue;

import linkedlist.LinkedList;

public class LinkedQueue {

    int length;
    LinkedList front,rear;

    public static void main (String args[])
    {
        LinkedQueue linkedQueue=new LinkedQueue();

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
        LinkedList pointer=front;
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
    public void Enqueue(int data)
    {
        if(rear==null && front==null)
        {
        rear=front=new LinkedList(data);
        }
        else {
            rear.setNextNode(new LinkedList(data));
            rear = rear.getNextNode();
        }
    }


    public void Dequeue()
    {
        if(front==null)
        {
            System.out.println("Queue Is empty");
        }
        else
        front=front.getNextNode();
    }


}
