package queue;

import stack.StackUsingLinkedList;

public class ReverseQueueUsingStack {

    StackUsingLinkedList stackUsingLinkedList;
    LinkedQueue linkedQueue;
    public static void main(String args[])
    {
        ReverseQueueUsingStack reverseQueueUsingStack=new ReverseQueueUsingStack();
        reverseQueueUsingStack.linkedQueue=new LinkedQueue();
        reverseQueueUsingStack.stackUsingLinkedList=new StackUsingLinkedList();
        for(int i=0; i<10; i++) {
            reverseQueueUsingStack.linkedQueue.Enqueue(i);
        }
        reverseQueueUsingStack.linkedQueue.print();
        while (reverseQueueUsingStack.linkedQueue.front!=null) {
            reverseQueueUsingStack.stackUsingLinkedList.push(reverseQueueUsingStack.linkedQueue.front.getData());
            reverseQueueUsingStack.linkedQueue.Dequeue();
        }

        reverseQueueUsingStack.stackUsingLinkedList.print();

    }
}
