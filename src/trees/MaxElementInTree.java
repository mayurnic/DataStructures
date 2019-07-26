package trees;

import queue.LinkedQueueObject;

public class MaxElementInTree {

    public static void main (String args[])
    {
        BinaryTreeObject bt=new BinaryTreeObject();
        BinaryTreeObject root=bt.enterData();
        System.out.println(maxElementInTree(root));
    }

    public static int maxElementInTree(BinaryTreeObject root)
    {
        int max=0;

        LinkedQueueObject queue=new LinkedQueueObject();
        if(root!=null)
            queue.Enqueue(root);

        max=(Integer)root.data;
        while(!queue.isEmpty())
        {
            BinaryTreeObject temp=(BinaryTreeObject) queue.Dequeue();
            if((Integer)temp.data<=max)
                max=(Integer)temp.data;
            queue.Enqueue(temp.leftNode);
            queue.Enqueue(temp.rightNode);
        }
    return max;
    }
}
