//2.6 Palindrome: Implement a function to check if a linked list is a palindrome. 
class {
  private static boolean isPalindromeLL(LinkedList list) {
        // 1 -> 2 -> 3 -> 2 -> 1

        StringBuilder sb = new StringBuilder();
        Node current = list.head;
        while(current != null) {
            sb.append(current.data);
            current = current.next;
        }

        System.out.println( "sb: "+sb);

        return isPalindrome(sb.toString());
       
    }
    private static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while( left < right){
            if(s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
