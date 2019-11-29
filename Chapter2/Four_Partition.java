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
        while(lessHead.next != null) {
            lessHead = lessHead.next;
        }
        lessHead.next = moreHead;

        return LessK;
    }
  
  
  
  private static LinkedList partitionLL2(LinkedListNode node, int k) {

        LinkedList head = node;
        LinkedList tail = node;

        Node current = node;
        while(current != null) {
            LinkedListNode NEXT = current.next;
            if(current.data < x){
                current.next = head;
                head = current;
            }
            else{
                tail.next = node;
                tail = current;
            }
            current = NEXT;
        }
        tail.next = null;

        return head;
    }



}
