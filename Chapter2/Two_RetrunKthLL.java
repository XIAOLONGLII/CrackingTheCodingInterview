/*
2.2 Return Kth to Last: Implement an algorithm to find the kth to last element of a singly linked list. 
*/
class Two_RetrunKthLL {

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
