package trees;

import queue.LinkedQueueObject;

public class BTNoOfLeaf {
public static void main(String args[])
{
    System.out.println(noOfLeaf(new BinaryTreeObject().enterData()));
}

public static int noOfLeaf(BinaryTreeObject root)
{
    LinkedQueueObject queue=new LinkedQueueObject();
    int count=0;

    if(root!=null)
       queue.Enqueue(root);

    while(!queue.isEmpty())
    {
        BinaryTreeObject current=(BinaryTreeObject) queue.Dequeue();

        if(current.leftNode==null && current.rightNode==null)
        {
        count++;
        }
         else
        {
            if (current.leftNode != null)
                queue.Enqueue(current.leftNode);
            if (current.rightNode != null)
                queue.Enqueue(current.rightNode);
        }

    }

    return count;
}

}
