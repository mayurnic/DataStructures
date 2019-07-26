package trees;

import queue.LinkedQueue;
import queue.LinkedQueueObject;

public class SearchElementInTree {

    public static void main (String args[])
    {
        BinaryTreeObject bt=new BinaryTreeObject();
        BinaryTreeObject root=bt.enterData();
        System.out.println(searchElementInTree(root,10));
        System.out.println(searchElementInTree(root,5));
    }

    public static boolean searchElementInTree(BinaryTreeObject root,int data)
    {
        LinkedQueueObject queue=new LinkedQueueObject();
        if(root!=null)
            queue.Enqueue(root);

        while(!queue.isEmpty())
        {
            BinaryTreeObject temp=(BinaryTreeObject) queue.Dequeue();
            if(temp.data.equals(data))
                return true;
            else
            {
                queue.Enqueue(temp.leftNode);
                queue.Enqueue(temp.rightNode);
            }
        }
        return false;
    }
}
