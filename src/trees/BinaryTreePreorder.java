package trees;

public class BinaryTreePreorder {

    static BinaryTree parent;
    public static void main(String args[])
    {
        BinaryTree bt=new BinaryTree();
        bt=bt.enterData();
        PreOrderTraversal(bt);

    }

    public static void PreOrderTraversal(BinaryTree pointer)
    {


        if(pointer.getLeftNode()!=null)
        {
            parent=pointer;
            PreOrderTraversal(pointer.leftNode);
        }

        else
        {

            System.out.println(pointer.data);
            System.out.println(parent.data);
            PreOrderTraversal(parent.rightNode);

        }



    }

}
