class Four_Partition {
  
  private static LinkedList partitionLL(LinkedList list, int k) {

        LinkedList LessK = new LinkedList();
        LinkedList MoreK = new LinkedList();

        Node current = list.head;
        while(current != null) {
            if(current.data < k){
                LessK = insert(LessK, current.data); 
            }
            else {
                MoreK = insert(MoreK, current.data);
            }
            current = current.next;
        }
        Node lessHead = LessK.head;
        Node moreHead = MoreK.head;
        while(lessHead != null) {
            lessHead = lessHead.next;
        }
        lessHead.next = moreHead;

        return LessK;
    }
}
