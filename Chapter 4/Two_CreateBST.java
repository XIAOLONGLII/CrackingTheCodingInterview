/*
 Minimal Tree: Given a sorted (increasing order) array with unique integer elements, write an
algorithm to create a binary search tree with minima! height. 

*/
class Node{
   Node left;
   Node right;
   int data;
   public Node(int data) {
     this.data = data;
     left = right = null;
   }
}
class BST{
   static Node root;
   public Node convertSortedArrToBST(int[] nums, Node left, Node right) { 
      if(nums.length == 0 || left > right) return null;
      int mid = (left + right) / 2;
      Node root = new Node(nums[mid]);
      root.left = convertSortedArrToBST(nums, left, mid - 1);
      root.right = convertSortedArrToBST(nums, mid + 1, right);
      return root;
   }
   // print the tree in pre-order travesal
   public void preOrderTreversal(Node root) {
     // root -> left -> right
    if(root == null) return;
    System.out.println(root.data);
    preOrderTreversal(root.left);
    preOrderTreversal(root.right);
   }
 
   public static void main(String[] args) {
     BST bst = new BST();
     int[] arr = {1, 2, 3, 4, 5};
     root = convertSortedArrToBST(arr, 0, 5); // bst tree
     preOrderTreversal(root);
   }
}
