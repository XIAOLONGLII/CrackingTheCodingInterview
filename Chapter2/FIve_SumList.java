class FIve_SumList {
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

