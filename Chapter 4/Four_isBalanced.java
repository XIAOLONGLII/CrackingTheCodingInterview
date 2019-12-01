/*
4.4 Check Balanced: Implement a function to check if a binary tree is balanced. For the purposes of
this question, a balanced tree is defined to be a tree such that the heights of the two subtrees of any
node never differ by more than one. 
*/
class Four_isBalanced {
  private static boolean isBalanced(Node root) {
		if(root == null) return true;
		
		return height(root) <= 1;
	}
	private static int height(Node root) {
		
		if(root == null) return 0;
		int L = height(root.left);
		int R = height(root.right);
		return Math.abs(L - R);
		
	}

}
