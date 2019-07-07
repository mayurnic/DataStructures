package linkedlist;

import java.util.HashSet;
import java.util.Hashtable;

public class CheckCyclicLinkedList {

    public static void main(String args[]) {
        LinkedList ll = new LinkedList();
        LinkedList head = ll.createCyclicLinkedList();
        //LinkedList head = ll.createLinkedList();

    new CheckCyclicLinkedList().FloydCycle(head);


}

void FloydCycle(LinkedList head)
{
    LinkedList slowPointer=head,fastPointer=head;

    while(slowPointer.nextNode!=null && fastPointer.nextNode!=null)
    {
        slowPointer=slowPointer.nextNode;
        fastPointer=fastPointer.nextNode.nextNode;
        if(slowPointer==fastPointer) {
            int counter=0;

            System.out.println(slowPointer.data);
            System.out.println("Cyclic LinkedList");
            while(true)
            {

                fastPointer=fastPointer.nextNode;
                counter++;
                if(fastPointer==slowPointer) {
                    System.out.println("Size of the Loop: " + counter);

                break;
                }
            }

            break;
        }

    }
}


void usingHashset(LinkedList head)
{
    LinkedList pointer=head;


    //Using HashSet
    HashSet<LinkedList>hashSet=new HashSet<>();
    while(pointer!=null)
    {
        if(hashSet.contains(pointer))
        {
            System.out.println(pointer.data);
            System.out.println("Cyclic LinkedList");
            break;
        }
        else
        {
            hashSet.add(pointer);
            pointer = pointer.nextNode;
        }
    }

}


}
