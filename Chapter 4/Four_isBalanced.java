/*
4.4 Check Balanced: Implement a function to check if a binary tree is balanced. For the purposes of
this question, a balanced tree is defined to be a tree such that the heights of the two subtrees of any
node never differ by more than one. 
*/
class Four_isBalanced {
	// 1. O(N*logN)
	  private static boolean isBalanced(Node root) {
	     if(root == null) return true;
	     int L = getHeight(root.left);
	     int R = getHeight(root.right);
	     return Math.abs(L - R) <= 1 && isBalanced(root.left) && isBalanced(root.right);
	  }
	  private int getHeight(Node root) {
	     if(root == null) {
		return 0;
	     }
	     int L = getHeight(root.left);
	     int R = getHeight(root.right); 
	     return Math.max( L, R) + 1;
	  }
	
	
//2nd method O(n), we starts from height of tree, 
    //if it is no balanced, we don't use the height in the balanced method, just return Integer.MIN_VALIUE;
	private static int checkHeight(Node root) {
		if(root == null) {
			return -1;
		}
		int leftHeight = checkHeight(root.left);
		if(leftHeight == Integer.MIN_VALUE){
			return Integer.MIN_VALUE;
		}
		int rightHeight = checkHeight(root.right);
		if(rightHeight == Integer.MIN_VALUE) {
			return Integer.MIN_VALUE;
		}

		int heightDiff = leftHeight - rightHeight;
		if(Math.abs(heightDiff) > 1) {
			return Integer.MIN_VALUE;
		}
		else {
			return Math.max(leftHeight, rightHeight) + 1;
		}
	}
	private static boolean isBalancedOrNot(Node root){
		return checkHeight(root) != Integer.MIN_VALUE;
	}
	
     }

	/*	
		root = 1, != null
	root.left = 2,  root.left =root, root != null, 
	root.left.left = 4, root!=null
	root.left.left.left= null, return 0; left = 0;
	root.left.left.right(4) = null return 0, max (left, right) + 1= 1

	means node.left (2)= 1

	node.left.right = 5, not null. 
	node.left.right.left = 6, not null
	node.left.right.left.left == null, left = 0
	node.left.right.left = 6 -> max(0, 0) + 1


	node.left.right(5).left = 1;
	node.left.right(5).right = 0;
	means node.left.right(5) = (1, 0 ) + 1 = 2;

	means node.left (2)= Math.max(1, 2) + 1 = 3

	node(1) = Math.max*( 3, 1)+ 1 = 4
	
	*/
}
