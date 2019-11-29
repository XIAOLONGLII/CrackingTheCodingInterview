class Three_DeleteMiddleNode {

  private static LinkedList deleteMiddleNode(LinkedList list) {
        // a - >b- >c - >d - >e- >f 
        // a - >b- >d - >e- >f 
        Node walker = list.head;
        Node runner = list.head;
        LinkedList afterDelete = new LinkedList();
        while(runner.next != null && runner.next.next != null) {
            walker = walker.next;
            runner = runner.next.next;
        }

        Node current = list.head;

        while(current != null) {
            if(current != walker){
                afterDelete = insert(afterDelete, current.data);
            } 
            current = current.next;
        }
        return afterDelete;
    }
  
  
  
  private static boolean deleteMiddleNode(Node middle) {
        if(middle == null || middle.next == null) return false;
        Node Next = middle.next;
        middle.data = Next.data;
        middle.next = Next.next;
        return true; 
    }

}
