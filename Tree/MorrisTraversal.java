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
				TreeNode pre=curl.left; 
				while(pre.right!=null && pre.right!=curl)
					pre=pre.right;
				if(pre.right==null) {
					pre.right=curl;
					curl=curl.left;
				}else
					if(pre.right==curl) {
						pre.right=null; 
						System.out.println(curl.val);
						curl=curl.right;
					}
			}
		}
	}
	
	public void preorder(TreeNode root) {
		
		TreeNode curl=root; 
		while(curl!=null) {
			if(curl.left==null) {
				System.out.println(curl.val);
				curl=curl.right;
			}else {
				TreeNode pre=curl.left;  
				while(pre.right!=null && pre.right!=curl)
					pre=pre.right;
				
				if(pre.right==null) {
					pre.right=curl; 
					System.out.println(curl.val);
					curl=curl.left;
				}
				else {
					pre.right=null;  
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
		MorrisTraversal m=new MorrisTraversal(); 
		m.preorder(root);
		
		//Inorder(root);
		
		

	}

}
