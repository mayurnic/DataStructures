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

    public int height(BinaryTree root)
    {
        if(root==null)
            return 0;
        else
        {
            int hl=height(root.leftNode);
            int hr=height(root.rightNode);

            if(hl>hr)
                return hl+1;
            else
                return hr+1;
        }
    }
    public BinaryTree getLeftNode()
    {
return this.leftNode;
    }
    public BinaryTree getRightNode()
    {
        return this.rightNode;
    }

    public void print(BinaryTree root)
    {
        if(root!=null)
        {
           while(root.leftNode !=null || root.rightNode!=null) {
               System.out.println(leftNode.data);
               System.out.println();
               print(root.leftNode);
               print(root.rightNode);
           }
           }
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
