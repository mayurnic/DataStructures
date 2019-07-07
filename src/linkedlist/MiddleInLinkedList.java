package linkedlist;

public class MiddleInLinkedList {

    public static void main(String args[]) {
        LinkedList head = new LinkedList().createLinkedList();
        System.out.println(new MiddleInLinkedList().middleNode(head).data);
    }

    public LinkedList middleNode(LinkedList head) {
        LinkedList pointer1, pointer2;
        pointer1 = pointer2 = head;

        while (pointer2.getNextNode() != null) {
            pointer2 = pointer2.nextNode.nextNode;
            pointer1 = pointer1.nextNode;

        }
        //System.out.println(pointer1.data);
        return pointer1;
    }

}