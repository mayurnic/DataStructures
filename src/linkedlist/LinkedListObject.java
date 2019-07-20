package linkedlist;

public class LinkedListObject {


    Object data;
    LinkedListObject nextNode;

    public LinkedListObject(Object data)
    {
        this.data=data;
    }

    public LinkedListObject() {

    }

    public Object getData(LinkedListObject node)
    {
        return node.data;
    }
    public Object getData()
    {
        return this.data;
    }

    public void setNextNode(LinkedListObject node)
    {
        this.nextNode=node;
    }


    public LinkedListObject getNextNode()
    {
        return this.nextNode;
    }


    public void printLinkedList(LinkedListObject head)
    {
        LinkedListObject pointer=head;
        while(pointer!=null)
        {
            System.out.print(pointer.data);
            pointer=pointer.nextNode;
        }

    }

    public LinkedListObject createLinkedList()
    {
        LinkedListObject head=new LinkedListObject(1);

        LinkedListObject pointer=head;
        for(int i=2; i<20; i++)
        {
            pointer.nextNode=new LinkedListObject(i);
            //pointer.setNextNode(pointer.nextNod);
            pointer=pointer.nextNode;
        }
        return head;
    }

    public LinkedListObject createCyclicLinkedList()
    {
        LinkedListObject head=new LinkedListObject(1);

        LinkedListObject pointer=head;
        for(int i=2; i<20; i++)
        {
            pointer.nextNode=new LinkedListObject(i);
            //pointer.setNextNode(pointer.nextNod);
            pointer=pointer.nextNode;
        }
        pointer.nextNode=head.nextNode.nextNode;
        return head;
    }


}
