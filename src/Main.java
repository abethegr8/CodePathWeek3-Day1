import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello World!");

        ListNode myList = new ListNode();
        myList.head = new ListNode.Node(10);
        ListNode.Node second = new ListNode.Node(11);
        myList.head.next = second;
        ListNode.Node third = new ListNode.Node(11);
        second.next = third;
        ListNode.Node fourth = new ListNode.Node(14);
        third.next = fourth;
        ListNode.Node fifth = new ListNode.Node(15);
        fourth.next = fifth;
        ListNode.Node sixth = new ListNode.Node(16);
        fifth.next = sixth;
        ListNode.Node seventh = new ListNode.Node(16);
        sixth.next = seventh;
        ListNode.Node eighth = new ListNode.Node(17);
        seventh.next = eighth;
        eighth.next = null;

        /*
        //print the list
        ListNode.Node currNode = myList.head;
        while(currNode != null){
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
        }
        System.out.println();*/


        ListNode.Node currentNode = myList.head;
        while(currentNode != null && currentNode.next != null){
            if(currentNode == currentNode.next){
                currentNode.next = currentNode.next.next;
            }
            else{
                currentNode = currentNode.next;
            }
        }

    }
}
