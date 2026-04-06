package Tree;

public class DeleteNodeInBST {

	  public TreeNode rec(TreeNode root,int key){
	        if(root==null) return null; 
	        
	        if(key<root.val){
	            root.left=rec(root.left,key);
	        }else
	        if(key>root.val){
	            root.right=rec(root.right,key);
	        }else{
	            if(root.left==null)
	            return root.right; 
	            else
	            if(root.right==null)
	            return root.left; 

	            TreeNode curl=root.left; 
	            while(curl.right!=null)
	            curl=curl.right; 
	            curl.right=root.right; 
	            root.right=null;
	            return root.left;
	        }
	        return root;
	    }
	
	
	
	public TreeNode deleteNode(TreeNode root, int key) {
        return rec(root,key);
    }
	public static void main(String[] args) {
		TreeNode rootNode=TreeStructure.getTree(); 
		
		DeleteNodeInBST obj=new DeleteNodeInBST(); 
		obj.deleteNode(rootNode, 5);
		

	}

}
