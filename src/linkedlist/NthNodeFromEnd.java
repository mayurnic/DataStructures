package linkedlist;

public class NthNodeFromEnd {

    public static void main(String args[]) {
        LinkedList list = new LinkedList();
        LinkedList head=list.createLinkedList();

        int temp=3;
        LinkedList first=head,second=head;

        while(temp>1)
        {
            first=first.nextNode;
            temp--;
        }

        while(first.nextNode!=null)
        {
            first=first.nextNode;
            second=second.nextNode;
        }

        System.out.println(second.data);


    }
}
