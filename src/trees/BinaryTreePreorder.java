package trees;

public class BinaryTreePreorder {

    static BinaryTree parent;
    public static void main(String args[])
    {
        BinaryTree bt=new BinaryTree();
        bt=bt.enterData();
        preOrderTraversal(bt);

    }

    public static void preOrderTraversal(BinaryTree pointer)
    {

        if(pointer!=null) {
            System.out.print(pointer.data);
            preOrderTraversal(pointer.leftNode);
            preOrderTraversal(pointer.rightNode);
        }
    }

}
