package trees;

public class BinaryTreeInOrder {

    static BinaryTree parent;
    public static void main(String args[])
    {
        BinaryTree bt=new BinaryTree();
        bt=bt.enterData();
        inOrderTraversal(bt);
    }

    public static void inOrderTraversal(BinaryTree pointer)
    {
        if(pointer!=null) {

            inOrderTraversal(pointer.leftNode);
            System.out.print(pointer.data);
            inOrderTraversal(pointer.rightNode);

        }
    }

}
