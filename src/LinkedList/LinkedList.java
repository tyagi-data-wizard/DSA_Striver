package LinkedList;

import java.util.ArrayList;
import java.util.List;

class Node{
    int data;
    Node next;

    public Node(int data){
        this.data=data;
    }

}

public class LinkedList {

    public static void main(String[] args) {
        Node head = new Node(5);

        Node newNode = new Node(4);
        head.next= newNode;

        head = insertAtFront(head,6);
        head = insertAtFront(head,7);

        printList(head);

        head =  deleteHead(head);

        printList(head);

        head = insertAtFront(head,7);

        head = deleteFromEnd(head);
        printList(head);

        head = deleteNode(head,2);
        printList(head);

        System.out.println(searchKey(head,7));

        System.out.println( searchKeyReversal(head,5) );


        head = insertAtFront(head, 8);
        head = insertAtFront(head, 4);
        head = insertAtFront(head, 9);
        printList(head);


        // modifyLinkedList
        //9 -> 4 -> 8 -> 7 -> 5
        //-4-> 3 -> 8 -> 4 -> 9
        // head = modifyLinkedListNaive(head);
        //printList(head);

        head = modifyLinkedList(head);
        printList(head);

    }

    private static Node modifyLinkedList(Node head) {
        Node mid;
        Node slow=head;
        Node fast =head;

        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        mid = slow;

        Node reversedLL = mid.next;
        mid.next = null;


        // reverse the 2nd half of the ll
        reversedLL = reverseLinkedList(reversedLL);


        Node curr1 = head;
        Node curr2 = reversedLL;
        //modify logic
        // Iterating over both halves of the list
        // and modifying the values
        while (curr2 != null) {
            int x = curr1.data;
            curr1.data = curr2.data - x;
            curr2.data = x;
            curr1 = curr1.next;
            curr2 = curr2.next;
        }

        // Reversing the second half of the list
        // again and connecting both halves
        mid.next = reverseLinkedList(reversedLL);

        return head;
    }

    private static Node reverseLinkedList(Node reversedLL) {
        Node prev = null;
        Node curr = reversedLL;
        Node next = reversedLL.next;

        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }


        printList(prev);

        return prev;
    }

    private static Node modifyLinkedListNaive(Node head) {

        List<Integer> list = new ArrayList<>();

        Node temp = head;

        while(temp!=null){
            list.add(temp.data);
            temp = temp.next;
        }

        int size = list.size();

        //modify logic
       for(int i=0;i<size/2;i++){
           int dummy = list.get(i);
           list.set(i, (list.get(size-i-1)-dummy));
           list.set(size-i-1,dummy);
       }


       temp = head;

        //turn list to linkedlist
        for(int i=0;i<size;i++) {
            temp.data = list.get(i);
            temp = temp.next;
        }


        return head;
    }

    private static boolean searchKeyReversal(Node head, int key){

        if(head == null){
            return false;
        }

        if(head.data==key){
            return true;
        }

        return searchKeyReversal(head.next,key);
    }

    private static boolean searchKey(Node head, int key){

        while(head!=null){
            if(head.data==key){
                return true;
            }
            head = head.next;
        }

        return false;
    }

    private static Node deleteNode(Node head, int pos){
        int currPos =1;

        if(head==null || head.next == null){
            return null;
        }

        Node curr = head;

        while(curr.next!=null){

            if(currPos==pos-1){
                curr.next = curr.next.next;
            }
            curr=curr.next;
        }

        return head;
    }

    private static Node deleteFromEnd(Node head){
        if(head==null || head.next==null){
            return null;
        }

        Node temp = head;

        while(temp!=null){
            if(temp.next.next==null){
                temp.next=null;
            }
            temp=temp.next;
        }

        return head;
    }

    private static Node deleteHead(Node head) {
        head = head.next;
        return head;
    }


    // Function to insert a new node at
    // the beginning of the list
    static Node insertAtFront(Node head, int x) {
        Node newNode = new Node(x);
        newNode.next = head;
        return newNode;
    }

    static void printList(Node head) {
        Node curr = head;

        while (curr != null) {
            System.out.print(curr.data);
            if (curr.next != null) {
                System.out.print(" -> ");
            }
            curr = curr.next;
        }
        System.out.println();
    }

}
