package linkedlist;

public class LinkedListPalindrome {

public static void main(String args[])
{
    LinkedList head=new LinkedList(1);
    head.setNextNode(new LinkedList(2));
    head.getNextNode().setNextNode(new LinkedList(1));
    System.out.println(new LinkedListPalindrome().checkLinkedListPalindrome(head));
}

public boolean checkLinkedListPalindrome(LinkedList head)
{
    LinkedList middleNode=new MiddleInLinkedList().middleNode(head);

    LinkedList secondHalfHead=middleNode.getNextNode();

    LinkedList pointer=head;
    while(pointer!=middleNode)
    {
        if(pointer.data==secondHalfHead.data)
        {
            pointer=pointer.nextNode;
            secondHalfHead=secondHalfHead.nextNode;
        }
        else
        {
            return false;
        }

    }
    return  true;
}
}
