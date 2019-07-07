package trees;

public class BinaryTree {

    int data;

    BinaryTree leftNode;
    BinaryTree rightNode;

    BinaryTree()
    {

    }
    BinaryTree(int data)
    {
        this.data=data;
        leftNode=null;
        rightNode=null;
    }

    public BinaryTree setLeftNode(BinaryTree node)
    {
        this.leftNode=node;
        return leftNode;
    }
    public BinaryTree setRightNode(BinaryTree node)
    {
        this.rightNode=node;
        return rightNode;
    }

    public BinaryTree getLeftNode()
    {
return this.leftNode;
    }
    public BinaryTree getRightNode()
    {
        return this.rightNode;
    }

    public BinaryTree enterData()
    {
        BinaryTree root=new BinaryTree(1);
        BinaryTree node2=root.setLeftNode(new BinaryTree(2));
        node2.setLeftNode(new BinaryTree(4));
        node2.setRightNode(new BinaryTree(5));

        BinaryTree node3=root.setRightNode(new BinaryTree(3));
        node3.setLeftNode(new BinaryTree(6));
        node3.setRightNode(new BinaryTree(7));
        //System.out.println(root.data);
    return root;
    }

    public static void main(String args[])
    {
        BinaryTree root=new BinaryTree(1);
        BinaryTree node2=root.setLeftNode(new BinaryTree(2));
        node2.setLeftNode(new BinaryTree(4));
        node2.setRightNode(new BinaryTree(5));

        BinaryTree node3=root.setRightNode(new BinaryTree(3));
        node3.setLeftNode(new BinaryTree(6));
        node3.setRightNode(new BinaryTree(7));
        System.out.println(root.data);
    }


}
