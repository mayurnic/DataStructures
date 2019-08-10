package trees;

public class LCABinaryTree {

    public static void main(String args[])
    {
        BinaryTreeObject bt=new BinaryTreeObject();
        bt=bt.enterData();
        System.out.println(findLCA(bt,new BinaryTreeObject(4),new BinaryTreeObject(5)).data);
    }

    public static BinaryTreeObject findLCA(BinaryTreeObject root, BinaryTreeObject a, BinaryTreeObject b)
    {
        if(root==null)
            return null;

        if(root.isEquals(a) || root.isEquals(b))
            return root;

        BinaryTreeObject left,right;

        left=findLCA(root.leftNode,a,b);
        right=findLCA(root.rightNode,a,b);

        if(left!=null && right!=null)
            return root;
        else
        return (left!=null?left:right);

    }

}
