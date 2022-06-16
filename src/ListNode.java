public class ListNode {
    Node head;

    public static class Node{
        int data;
        Node next;

        //default constructor
        Node(int d){
            data = d;
            next = null;
        }

    }

    /*
    public static void printList(){
        ListNode.Node currNode = ListNode.head;
        while(currNode != null){
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
        }
        System.out.println();
    }*/

}
