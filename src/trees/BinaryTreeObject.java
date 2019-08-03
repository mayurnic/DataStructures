package trees;

public class BinaryTreeObject {

    Object data;

    BinaryTreeObject leftNode;
    BinaryTreeObject rightNode;

    BinaryTreeObject()
    {

    }
    BinaryTreeObject(int data)
    {
        this.data=data;
        leftNode=null;
        rightNode=null;
    }

    public BinaryTreeObject setLeftNode(BinaryTreeObject node)
    {
        this.leftNode=node;
        return leftNode;
    }
    public BinaryTreeObject setRightNode(BinaryTreeObject node)
    {
        this.rightNode=node;
        return rightNode;
    }

    public int size(BinaryTreeObject root)
    {
        int left=0,right=0;
        if(root==null)
            return 0;
        if(root.leftNode!=null)
            left= size(root.leftNode);
        if(root.rightNode!=null)
            right=size(root.rightNode);

        return left+right+1;
    }

    public int height(BinaryTreeObject root)
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
    public BinaryTreeObject getLeftNode()
    {
        return this.leftNode;
    }
    public BinaryTreeObject getRightNode()
    {
        return this.rightNode;
    }

    public void print(BinaryTreeObject root)
    {
        if(root!=null)
        {
            System.out.println(root.data);
            if(root.leftNode !=null )
                print(root.leftNode);
            if( root.rightNode!=null) {
                print(root.rightNode);
            }
        }
    }

    public BinaryTreeObject enterData()
    {
        BinaryTreeObject root=new BinaryTreeObject(1);
        BinaryTreeObject node2=root.setLeftNode(new BinaryTreeObject(2));
        node2.setLeftNode(new BinaryTreeObject(4));
        node2.setRightNode(new BinaryTreeObject(5));

        BinaryTreeObject node3=root.setRightNode(new BinaryTreeObject(3));
        node3.setLeftNode(new BinaryTreeObject(6));
        node3.setRightNode(new BinaryTreeObject(7));
        //System.out.println(root.data);
        return root;
    }

    public static void main(String args[])
    {
      /*  BinaryTreeObject root=new BinaryTreeObject(1);
        BinaryTreeObject node2=root.setLeftNode(new BinaryTreeObject(2));
        node2.setLeftNode(new BinaryTreeObject(4));
        node2.setRightNode(new BinaryTreeObject(5));

        BinaryTreeObject node3=root.setRightNode(new BinaryTreeObject(3));
        node3.setLeftNode(new BinaryTreeObject(6));
        node3.setRightNode(new BinaryTreeObject(7));
        System.out.println(root.data);
    */
        BinaryTreeObject bt=new BinaryTreeObject();
        BinaryTreeObject root=bt.enterData();
        bt.print(root);
        System.out.println(bt.height(root));
        System.out.println(bt.size(root));

    }


}
