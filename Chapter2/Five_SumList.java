/*
Sum Lists: You have two numbers represented by a linked list, where each node contains a single
digit. The digits are stored in reverse order, such that the Vs digit is at the head of the list. Write a
function that adds the two numbers and returns the sum as a linked list.
EXAMPLE
Input: (7- > 1 -> 6) + (5 -> 9 -> 2).That is,617 + 295.
Output: 2 -> 1 -> 9. That is, 912.
FOLLOW UP
Suppose the digits are stored in forward order. Repeat the above problem.
EXAMPLE
Input: (6 -> 1 -> 7) + (2 -> 9 -> 5).That is, 617 + 295,
Output:9 -> 1 -> 2,Thatis,912.

*/
class Five_SumList {
  private static int sumList(LinkedList list2, LinkedList list1) {

       //l1: 1 2 3 4
       //l2: 1 2 3
       
        Node current1 = list1.head;
        Node current2 = list2.head;
        List<Integer> list = new ArrayList<>();
        while(current1 != null && current2 != null) {
            current1.data = current1.data + current2.data;
            list.add(current1.data);
            current1 = current1.next;
            current2 = current2.next;
        }
        if(current1 != null) {
            list.add(current1.data);
            current1 = current1.next;
        }
        if(current2 != null) {
            list.add(current2.data);
            current2 = current2.next;
        }

        int sum = 0;
        // 2 4 6 4
        int size = list.size();
        for(int i = size - 1; i >= 0; i--) {
            sum  += list.get(i) * Math.pow(10, i);
        }
        return sum;
    
    }
}

