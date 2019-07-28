package trees;

import queue.LinkedQueueObject;

public class HeightOfTree {

    public static void main (String args[])
    {
        BinaryTreeObject bt=new BinaryTreeObject();
        BinaryTreeObject root=bt.enterData();
        System.out.println(getTreeHeight(root));
    }

    public static int getTreeHeight(BinaryTreeObject root)
    {
        if (root==null)
            return 0;
        else
        {
            int lleft=getTreeHeight(root.leftNode);
            int lright=getTreeHeight(root.rightNode);
            if(lleft>lright)
                return lleft+1;
            else
                return lright+1;
        }
    }
}
