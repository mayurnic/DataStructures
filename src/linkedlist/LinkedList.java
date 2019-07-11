package linkedlist;

public class LinkedList {


    int data;
    LinkedList nextNode;

    public LinkedList(int data)
    {
        this.data=data;
    }

    public LinkedList() {

    }

    public int getData(LinkedList node)
    {
        return node.data;
    }
    public int getData()
    {
        return this.data;
    }

    public void setNextNode(LinkedList node)
    {
        this.nextNode=node;
    }


    public LinkedList getNextNode()
    {
        return this.nextNode;
    }


    public void printLinkedList(LinkedList head)
    {
        LinkedList pointer=head;
        while(pointer!=null)
        {
            System.out.print(pointer.data);
            pointer=pointer.nextNode;
        }

    }

    public LinkedList createLinkedList()
    {
        LinkedList head=new LinkedList(1);

        LinkedList pointer=head;
        for(int i=2; i<20; i++)
        {
            pointer.nextNode=new LinkedList(i);
            //pointer.setNextNode(pointer.nextNod);
            pointer=pointer.nextNode;
        }
        return head;
    }

    public LinkedList createCyclicLinkedList()
    {
        LinkedList head=new LinkedList(1);

        LinkedList pointer=head;
        for(int i=2; i<20; i++)
        {
            pointer.nextNode=new LinkedList(i);
            //pointer.setNextNode(pointer.nextNod);
            pointer=pointer.nextNode;
        }
        pointer.nextNode=head.nextNode.nextNode;
        return head;
    }


    public static  void main(String args[])
    {

        LinkedList pointer;

        for(int i=0; i<10; i++)
        {
            new LinkedList(1);

        }
        LinkedList headNode=new LinkedList(1);

        headNode.setNextNode(new LinkedList(2));


        pointer=headNode;
        while(pointer!=null)
        {
            System.out.println(pointer.data);
            pointer=pointer.nextNode;
        }

        LinkedList newNode=new LinkedList(0);
        newNode.nextNode=headNode;
        pointer=newNode;
        while(pointer!=null)
        {
            System.out.println(pointer.data);
            pointer=pointer.nextNode;
        }

        pointer=newNode;
        int temp=2;

        while(pointer!=null)
        {
            if(pointer.data==temp)
                pointer.nextNode=null;

        }
    }
}
