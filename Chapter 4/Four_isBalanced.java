/*
4.4 Check Balanced: Implement a function to check if a binary tree is balanced. For the purposes of
this question, a balanced tree is defined to be a tree such that the heights of the two subtrees of any
node never differ by more than one. 
*/
class Four_isBalanced {
  private static boolean isBalanced(Node root) {
	  if(root == null) return true;
	  int L = getHeight(root.left);
	  int R = getHeight(root.right);
	  return Math.abs(L - R) <= 1 && isBalanced(root.left) && isBalanced(root.right);
  }
  private static int getHeight(Node root) {
		
	if(root == null) return 0;
	int L = getHeight(root.left);
	int R = getHeight(root.right);
	return Math.max(L,R) + 1;
  }

}
