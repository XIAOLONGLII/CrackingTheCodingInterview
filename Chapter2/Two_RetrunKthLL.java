/*
2.2 Return Kth to Last: Implement an algorithm to find the kth to last element of a singly linked list. 
*/
class Two_RetrunKthLL {
     private static int theKthToLastLL(LinkedList list, int K) {

        // k = 2, would be the last 2 
        // 1 2 3 4 5-> 4
        // find the length of linked list then - k + 1
        Node current = list.head;
        int listLength = 0;
        while(current != null) {
            listLength++;
            current = current.next;
        }

        int location = listLength - K + 1;
        Node cur = list.head;
        int count = 0;
        while(cur != null) {
            count++;
            if(count == location) {
                return cur.data;
            }
            cur = cur.next;
        }
        return -1;

    }
    
    
    
    
    // bonus point: print all ll from K till end
    private static LinkedList KthToLastLL(LinkedList list, int K) {
        // return Kth to the last
        // k = 2, then 2 to the last
        if( K < 0 ) return null;

        int count = 0;
        Node current = list.head;
        while(current != null) {
            count++;
            if(count == K) {
                list.head = current;
            }

            current = current.next;
        }
        if(K > count) return null;
        return list;

    }

}
