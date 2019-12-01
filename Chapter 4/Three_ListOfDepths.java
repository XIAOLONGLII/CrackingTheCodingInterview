/*4.3 List of Depths: Given a binary tree, design an algorithm which creates a linked list of all the nodes
at each depth (e.g., if you have a tree with depth D, you'll have D linked lists). 
*/

class Three_ListOfDepths {
  private static List<List<Integer>> depthOfList(Node root, List<List<Integer>> lists, int level) {

      if(root == null) return null;
      List<Integer> list = null;
      if(list.size() == level){
        list = new LinkedList<Node>();
        lists.add(list);
      }
      else {
        list = lists.get(level);
      }
      list.add(level);
      list.add(root);

      depthOfList(root.left, lists, level + 1);
      depthOfList(root.right, lists, level + 1);
    }
    
  List<List<Integer>> depthOfList(Node root) {
        List<List<Integer>> lists = new ArrayList<LinkedList<Node>>();
        depthOfList(root, lists, 0);
        return list;
  }


}
