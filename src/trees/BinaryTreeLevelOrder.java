package trees;

import linkedlist.LinkedListObject;
import queue.LinkedQueueObject;

public class BinaryTreeLevelOrder {

    public static void main(String args[])
    {
        BinaryTreeObject bt=new BinaryTreeObject();
        bt=bt.enterData();
        System.out.println(bt.height(bt));
        levelOrderTraversal(bt);
    }

    public static void levelOrderTraversal(BinaryTreeObject root)
    {
        LinkedQueueObject queue=new LinkedQueueObject();

        BinaryTreeObject tempNode = root;

        if(root!=null)
            queue.Enqueue(root);

        while(!queue.isEmpty())
        {

            BinaryTreeObject tempObj=(BinaryTreeObject)((LinkedListObject) queue.Dequeue()).getData();

            queue.Enqueue(tempObj.leftNode);
            queue.Enqueue(tempObj.rightNode);

            System.out.println(tempObj.data);
        }

    }

}
