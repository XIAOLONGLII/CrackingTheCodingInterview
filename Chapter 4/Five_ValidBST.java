//4.5 Validate BST: Implement a function to check if a binary tree is a binary search tree. 
class Five_ValidBST {
  private static boolean isValidBST(Node root) {
	  /*
	  1. left value smaller than root value
	  2. right value greater than root value
	  3. each sub tree is a valid BST
	  
	  */

		// left < root, root < right
		if(root == null) return true;
		if(root.left != null&& root.left.data > root.data){
			return false;
		}
		if(root.right != null&& root.right.data < root.data){
			return false;
		}

		return isValidBST(root.left) && isValidBST(root.right);

	}

}
