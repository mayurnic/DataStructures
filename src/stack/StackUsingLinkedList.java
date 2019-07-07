package stack;

public class StackUsingLinkedList {

    int length;
    LinkedList top=null;
    public static void main(String args[])
    {
        StackUsingLinkedList stack=new StackUsingLinkedList();
        stack.push(1);
        stack.push(2);
        stack.push(2);

        stack.print();
    }


void push(int data)
{
 if(top==null) {
     top=new LinkedList(data);
 }
 else
     top=new LinkedList(data).setNextNode(top);
 }

void pop()
{

}

void print()
{
    LinkedList pointer=top;
while(pointer!=null)
{
    System.out.println(pointer.data);
    pointer=pointer.next;
}
}



}



class LinkedList
{

LinkedList next;
int data;

LinkedList(int data)
{
    next=null;
    this.data=data;
}


LinkedList setNextNode(LinkedList next)
{
    this.next=next;
    return this;

}
LinkedList getNextNode()
{
    return this.next;
}

void addNode(int data)
{
    this.next=new LinkedList(data);
}




}
