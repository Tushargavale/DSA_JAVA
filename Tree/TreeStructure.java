package Tree;



class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}
/*
    
        
                10
              /    \
             5      15
           /  \       \
          3    7       18
         /    /  \    /
        1    6    8  16
     
 
 * 
 * */
public class TreeStructure {
	
	public static TreeNode getTree() {
		TreeNode root = new TreeNode(10);
		 root.left = new TreeNode(5);
	     root.right = new TreeNode(15);

	     root.left.left = new TreeNode(3);
	     root.left.right = new TreeNode(7);

	     root.right.right = new TreeNode(18);

	     root.left.left.left = new TreeNode(1);

	     root.left.right.left = new TreeNode(6);
	     root.left.right.right = new TreeNode(8);

	     root.right.right.left = new TreeNode(16);
	     
	     return root;
	     }


	public static void main(String[] args) {
		
		


	}

}
