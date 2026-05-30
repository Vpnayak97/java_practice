class Node {
	int data;
    Node left,right ;
    Node(int value){
    	data=value;
    	right=left=null;
    	
    }
}
public class Treees {
	static void inorder (Node root)
	{ if(root!=null) {
		inorder(root.left);
		System.out.print(root.data+" ");
		
		inorder(root.right);
	}}
	static void preorder(Node root) {
		if(root!=null) {
		System.out.print(root.data+" ");
		preorder(root.left);
		preorder(root.right);
		
	}}
	static void postorder(Node root) {
	if(root!=null) {	postorder(root.left);

		postorder(root.right);
		System.out.print(root.data+" ");
	}	}
	public static void main(String[] args) {
Node root=new Node(1);
root.left=new Node(2);
root.right=new Node(3);
root.left.left=new Node(4);
root.left.right=new Node(5);

System.out.println("Inorder traversal ");
inorder(root);
System.out.print("\n");
System.out.println("preorder traversal ");
preorder(root);
System.out.print("\n");
System.out.println("postorder traversal ");
postorder(root);
System.out.print("\n");
	}

}
 