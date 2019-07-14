package trees;

public class BinaryTreePostOrder {

    static BinaryTree parent;
    public static void main(String args[])
    {
        BinaryTree bt=new BinaryTree();
        bt=bt.enterData();
        postOrderTraversal(bt);
    }

    public static void postOrderTraversal(BinaryTree pointer)
    {
        if(pointer!=null) {

            postOrderTraversal(pointer.leftNode);
            postOrderTraversal(pointer.rightNode);
            System.out.print(pointer.data);

        }
    }

}
