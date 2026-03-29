package Tree;
/*


	   10
	 /    \
    5      15
   /  \       \
  3    7       18
 /    /  \    /
1   6    8  16


* 
* */
public class MorrisTraversal {
	
	public static void Inorder(TreeNode root) {
		TreeNode curl=root;  
		while(curl!=null) {
			if(curl.left==null) {
				System.out.println(curl.val);
				curl=curl.right;
			}else {
				TreeNode prev=curl.left; 
				while(prev.right !=null && prev.right!=curl)
					prev=prev.right; 
				if(prev.right==null) {
					prev.right=curl;
					curl=curl.left;
				}else {
					prev.right=null; 
					System.out.println(curl.val);
					curl=curl.right;
				}
					
			}
		}
	}
	
	
	
	public static void main(String[] args) {
		/*
		 * 
		 * Left =null? move to right


		 * Before moving to left,rightmost node on leftsubtree will be connected to current and after that current will go to left
 
		 * */
		
		TreeNode root=TreeStructure.getTree(); 
		
		
		Inorder(root);
		
		

	}

}
