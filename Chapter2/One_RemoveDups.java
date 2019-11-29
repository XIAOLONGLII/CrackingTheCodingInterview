/*
2.1 Remove Dups: Write code to remove duplicates from an unsorted linked list.
FOLLOW UP
How would you solve this problem if a temporary buffer is not allowed? 
*/
import java.util.*;
public class LinkedList { 
  
    Node head; 
    static class Node { 
        int data; 
        Node next; 
        // Constructor 
        Node(int d) { 
            data = d; 
            next = null; 
        } 
    } 
  
    // Method to insert a new node 
    public static LinkedList insert(LinkedList list, int data) 
    { 
        // Create a new node with given data 
        Node new_node = new Node(data); 
        new_node.next = null; 
  
        // If the Linked List is empty, 
        // then make the new node as head 
        if (list.head == null) { 
            list.head = new_node; 
        } 
        else { 
            // Else traverse till the last node 
            // and insert the new_node there 
            Node last = list.head; 
            while (last.next != null) { 
                last = last.next; 
            } 
  
            // Insert the new_node at last node 
            last.next = new_node; 
        } 
  
        // Return the list by head 
        return list; 
    } 
  
    // Method to print the LinkedList. 
    public static void printList(LinkedList list) 
    { 
        Node currNode = list.head; 
   
        System.out.print("LinkedList: "); 
   
        // Traverse through the LinkedList 
        while (currNode != null) { 
            // Print the data at current node 
            System.out.print(currNode.data + " "); 
   
            // Go to next node 
            currNode = currNode.next; 
        } 
    } 
   
    // Driver code 
    public static void main(String[] args) 
    { 
        LinkedList list = new LinkedList(); 

        list = insert(list, 1); 
        list = insert(list, 2);  
        list = insert(list, 3); 
        list = insert(list, 4); 
        list = insert(list, 5); 
        list = insert(list, 6); 
        list = insert(list, 7); 
        list = insert(list, 8); 
        list = insert(list, 2);
        list = insert(list, 6);
  
        // Print the LinkedList 
        printList(list);
        System.out.println();
        printList(removeDups(list));
        printList(removeDups2(list));
    } 

    private static LinkedList removeDups(LinkedList list) {
        //
        HashSet<Integer> UniqueValueofList = new HashSet<>();
        LinkedList UniqueList = new LinkedList();
        Node current = list.head;
        while(current != null) {
            if(UniqueValueofList.add(current.data)){
                UniqueList = insert(UniqueList,current.data);
            }
            current = current.next;
        }
        //printList(UniqueList); 
        return UniqueList;
    }
  
  private static LinkedList removeDups2(LinkedList list) {
        //
        HashSet<Integer> UniqueValueofList = new HashSet<>();
        Node pre = null;
        LinkedList res = new LinkedList();
        Node current = list.head;
        while(current != null) {
            if(UniqueValueofList.contains(current.data)){
                pre.next = current.next;
            }
            else {
                UniqueValueofList.add(current.data);
                pre = current;
                res = res.insert(res, pre.data);
            }
            current = current.next;
        }        
        return res;
    }

} 
