package trees;

import linkedlist.LinkedList;
import linkedlist.LinkedListObject;
import queue.LinkedQueueObject;
import stack.StackUsingLinkedList;

public class BinaryTreeLevelOrder {

    public static void main(String args[])
    {
        BinaryTreeObject bt=new BinaryTreeObject();
        bt=bt.enterData();
        System.out.println(bt.height(bt));
        levelOrderTraversal(bt);
        reverseLevelOrderTraversal(bt);
    }

    public static void levelOrderTraversal(BinaryTreeObject root)
    {
        LinkedQueueObject queue=new LinkedQueueObject();

        BinaryTreeObject tempNode = root;

        if(root!=null)
            queue.Enqueue(root);

        while(!queue.isEmpty())
        {

            BinaryTreeObject tempObj=(BinaryTreeObject)queue.Dequeue();

            queue.Enqueue(tempObj.leftNode);
            queue.Enqueue(tempObj.rightNode);

            System.out.println(tempObj.data);
        }

    }


    public static void reverseLevelOrderTraversal(BinaryTreeObject root)
    {
        LinkedQueueObject queue=new LinkedQueueObject();

        StackUsingLinkedList stack=new StackUsingLinkedList();

        BinaryTreeObject tempNode = root;

        if(root!=null)
            queue.Enqueue(root);

        while(!queue.isEmpty())
        {
            BinaryTreeObject tempObj=(BinaryTreeObject)queue.Dequeue();
            queue.Enqueue(tempObj.leftNode);
            queue.Enqueue(tempObj.rightNode);

            stack.push(tempObj.data);
        }

        while(!stack.isEmpty())
        {
            System.out.println(stack.pop().data);
        }

    }

}
