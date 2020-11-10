class Node
{
	int data;
	Node left;
	Node right;
	Node(int d)
	{
		data=d;
		left=null;
		right=null;
	}
	
}
public class BinaryTree_height {

	public static void main(String[] args) 
	{
		Node root=new Node(5);
		root.left=new Node(4);
		root.right=new Node(3);
		root.left.left=new Node(2);
		root.left.left.right=new Node(1);
		int h=height(root);
		System.out.println(h);
		

	}

	private static int height(Node root) 
	{
		// TODO Auto-generated method stub
		if (root==null)
			return 0;
		int ltree= height(root.left);
		int rtree= height(root.right);
		return 1+ Math.max(ltree,rtree);
	}


}
