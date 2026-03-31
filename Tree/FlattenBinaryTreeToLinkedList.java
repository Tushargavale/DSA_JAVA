package Tree;

public class FlattenBinaryTreeToLinkedList {
	 TreeNode prev=null;
	    public void Recursion(TreeNode root){
	        if(root==null) return; 
	       
	        Recursion(root.right); 
	        Recursion(root.left);
	       
	        root.right=prev;         
	        root.left=null; 
	       
	 
	        prev=root;
	        System.out.println(root.val);
	    

	    }
	public static void main(String[] args) {
		FlattenBinaryTreeToLinkedList obj=new FlattenBinaryTreeToLinkedList(); 
		TreeNode rootNode=TreeStructure.getTree();
		obj.Recursion(rootNode);

	}

}
