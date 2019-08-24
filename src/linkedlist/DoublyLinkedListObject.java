package linkedlist;

public class DoublyLinkedListObject {


    Object data;
    DoublyLinkedListObject node;
    DoublyLinkedListObject prevNode;
    DoublyLinkedListObject nextNode;

    public DoublyLinkedListObject(Object data)
    {
        this.data=data;
    }

    public DoublyLinkedListObject() {

    }

    public Object getData(DoublyLinkedListObject node)
    {
        return node.data;
    }

    public void setNextNode(DoublyLinkedListObject node)
    {
        this.nextNode=node;
    }

    public void setPreviousNode(DoublyLinkedListObject node)
    {
        this.prevNode=node;
    }

    public DoublyLinkedListObject getNextNode()
    {
        return this.nextNode;
    }

    public DoublyLinkedListObject getPrevNode()
    {

        return this.prevNode;
    }

    public void printLinkedList(DoublyLinkedListObject head)
    {
        DoublyLinkedListObject pointer=head;
        System.out.println("Traversing in Forward Direction");
        DoublyLinkedListObject pointer1 = null;
        while(pointer!=null)
        {
            System.out.print(pointer.data);
            pointer1=pointer;
            pointer=pointer.nextNode;
        }

        System.out.println("Traversing in Backward Direction");
        while(pointer1!=null)
        {
            System.out.print(pointer1.data);
            pointer1=pointer1.prevNode;
        }
    }

    public static DoublyLinkedListObject createLinkedList()
    {
        DoublyLinkedListObject head=new DoublyLinkedListObject(1);

        DoublyLinkedListObject pointer=head;
        for(int i=2; i<20; i++)
        {
            pointer.nextNode=new DoublyLinkedListObject(i);
            pointer.nextNode.prevNode=pointer;
            pointer=pointer.nextNode;
        }
        return head;
    }


    public DoublyLinkedListObject createCyclicLinkedList()
    {
        DoublyLinkedListObject head=new DoublyLinkedListObject(1);

        DoublyLinkedListObject pointer=head;
        for(int i=2; i<20; i++)
        {
            pointer.nextNode=new DoublyLinkedListObject(i);
            //pointer.setNextNode(pointer.nextNod);  b
            pointer=pointer.nextNode;
        }
        pointer.nextNode=head.nextNode.nextNode;
        return head;
    }


    public static  void main(String args[])
    {
         DoublyLinkedListObject head=createLinkedList();
         head.printLinkedList(head);


    }
}
