package linkedlist;

public class DeleteNodeInLinkedList {

    public static void main(String args[])
    {
        LinkedList list=new LinkedList();
        LinkedList head= list.createLinkedList();
        //list.printLinkedList(head);
        list.printLinkedList(deleteNode(head,10));


    }

    public static LinkedList deleteNode(LinkedList head,int data)
    {
        LinkedList pointer,prev = null;
        pointer=head;

        while(pointer!=null)
        {
            if(pointer.data==data)
            {
                if(pointer.nextNode!=null) {
                    prev.nextNode = pointer.nextNode;
                    return head;
                }
                return pointer.nextNode;
            }
            else {
                prev = pointer;
                pointer = pointer.nextNode;
            }
        }

        return null;
    }

}
