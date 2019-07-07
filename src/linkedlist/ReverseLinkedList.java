package linkedlist;

public class ReverseLinkedList {

    int data;
    LinkedList nextNode;

    public  static void main(String args[])
    {

        LinkedList head=new LinkedList().createLinkedList();
        head.printLinkedList(new ReverseLinkedList().reverseLinkedList(head));
    }


LinkedList reverseLinkedList(LinkedList head)
{
    LinkedList prev = null,next,current;
    current=head;

    while(current!=null)
    {
        //Set the Next Node to current's next node
        next=current.getNextNode();

        //point current's next  to prev
        current.setNextNode(prev);

        //Move prev to curent
        prev=current;

        //Move current to next
        current=next;


         }

    return prev;
}

}
