package linkedlist;

public class InsertNodeInSortedLinkedList {

    public static void main(String args[])
    {
        LinkedList linkedList=new LinkedList();
        LinkedList head=linkedList.createLinkedList();
        new InsertNodeInSortedLinkedList().insertNode(head,new LinkedList(5));
        linkedList.printLinkedList(head);
    }

    void insertNode(LinkedList head,LinkedList tempNode)
    {
      //  while(head)
      LinkedList pointer=head;

      while(pointer.nextNode!=null)
      {
          LinkedList prevNode=pointer;
          pointer=pointer.nextNode;
          if(pointer.data<tempNode.data)
          {

          }
          else
          {
            prevNode.nextNode=tempNode;
            tempNode.nextNode=pointer;
            break;
          }

      }

    }
}
