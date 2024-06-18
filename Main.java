class Node{
    int val;
    Node next;

    Node(int data , Node next){
        this.val = data;
        this.next = next;
    }

    Node(int data){
        this.val = data;
        this.next = null;
    }

}
/**
 * linkedList
 */
public class Main {
    public static Node middleOfNode(Node head)
    {
        Node fast= head , slow  = head;
        while(fast!=null && fast.next != null )
        {
            fast = fast.next.next;
            slow = slow.next;
        }

        return slow;
    }
    public static Node linkedList(Node head) {

        Node temp = head;
        Node prev = null;
        while(temp != null)
        {
            Node front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }
        return prev;
        
    }
    public static void printLinkedList(Node head){
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node head = new Node(5);
        head.next = new Node(4);
        head.next.next = new Node(90);
        head.next.next.next = new Node(45);
        head.next.next.next.next = new Node(56);
        printLinkedList(head);
        System.out.println("==Middle Element ==");
        Node middle = middleOfNode(head);
        System.out.println(middle.val);
        head = linkedList(head);
        System.out.println("==REVERSED LINKED LIST ==");
        printLinkedList(head);

    }
    
    
}
