package LinkedList;

public class nodeEx {


    // 1 -> 2 -> 3
    //data, next
        int data;
        Node next;


    public static void main(String[] args) {
        Node head = new Node(1);

        Node node = new Node(2);
        head.next = node;

        node = new Node(3);
        head.next.next=node;

        printList(head);

        head = insertAtHead(head,4);
        printList(head);

        head = deleteHead(head);
        printList(head);

        deleteTail(head);
        printList(head);

        head = insertAtHead(head,4);
        head = insertAtHead(head,5);
        printList(head);

        findLength(head);


        System.out.println("Searh result for 1 : "  + find(head,1));
        System.out.println("Searh result for 0 : "  + find(head,0));

        findMiddle(head);
    }

    private static void findMiddle(Node head) {
        // brute force is to count length and return (len/2+1)

        //slow fast/hare tortoise

        Node slow =head;
        Node fast = head;

        while( fast!=null  && fast.next!=null && slow!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        System.out.println("Middle : "+slow.data);


    }

    private static boolean find(Node head, int num){
        while(head!=null){
            if(head.data==num){
                return true;
            }
            head=head.next;
        }
        return false;
    }

    private static void findLength(Node head) {
        int len = 0;
        while(head!=null){
            len++;
            head=head.next;
        }
        System.out.println("Length of LL : "+ len);
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

    static Node insertAtHead(Node head, int data) {
        Node node = new Node(data);
        node.next = head;
        head = node;
        return head;
    }

    static Node deleteHead(Node head){
        return head.next;
    }

    static void deleteTail(Node head){
        while(head.next.next!=null){
            head = head.next;
        }
        head.next = null;
    }
}
