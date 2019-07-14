package queue;

import stack.StackUsingLinkedList;

public class ReverseQueueTillKthElement {


    StackUsingLinkedList stack;
    LinkedQueue queue;
    static ReverseQueueTillKthElement obj;


    public static void main(String args[])
    {
        obj =new ReverseQueueTillKthElement();

        obj.queue =new LinkedQueue();

        obj.stack =new StackUsingLinkedList();

        for(int i=0; i<10; i++) {
            obj.queue.Enqueue(i);
        }

        obj.queue.print();
        obj.reverseKElementInQueue(3);
        obj.queue.print();
    }

    public void reverseKElementInQueue(int k) {

        //Dequeue Kth elements from the queue and push into stack
        for (int i = 0; i < k; i++) {
            if (obj.queue.front != null) {
                obj.stack.push(obj.queue.front.getData());
                obj.queue.Dequeue();
            } else
                break;
        }

        //Check for the Stack and poping up the elements
        while (!obj.stack.isEmpty()) {
            obj.queue.Enqueue((int) obj.stack.pop());
        }

        for (int j = 0; j < obj.queue.size() - k; j++) {
            obj.queue.Enqueue(obj.queue.front.getData());
            obj.queue.Dequeue();

        }
    }
}
