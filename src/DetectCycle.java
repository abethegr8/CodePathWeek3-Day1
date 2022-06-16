//package com.company;
/*
Problem #2: Linked List Cycle
Given a linked list, determine if it has a cycle in it. For simplicity, assume the linked list cannot have more than 1000 nodes in it.

Examples:

This linked list would return True

Understand:
Can there be more than one cycle in the linked list?
No. Each node has only one next pointer. Therefore the cycle can only occur at the end of the linked list. Either a node points to a new node ahead of it, or it cycles back to a previous node.
Can the input list be empty?
Yes. The linked list can have 0-10000 nodes.

Match:
For Linked Lists, the top three things we want to consider are:

If we were able to take multiple passes of the linked list, would that help solve the problem?
We are not trying to determine the length of the list, nor are we trying to determine something about the values
stored at each node in the list. Taking multiple passes of the linked list will not help us determine whether or not
there is a cycle.
Would using a dummy head as a starting point help simplify our code and handle edge cases?
We are not rearranging the list. Rather, we are trying to determine the structure of the linked list.
If we used two pointers to iterate through the list at different speeds, would that help us solve this problem?
Two pointers could help us in this problem. How could we use two different pointers in this problem? Would we have the
pointers move at different speeds? Could the pointers reference the same node initially?

Plan:
1) Instantiate two pointers (slow, fast) pointing at the head of the list
2) Iterate over the LL (while slow != fast)
    a) If fast's next (fast.next) or fast's next's next (fast.next.next) are Null, return False
    b) Move slow one node forward
    c) Move fast two nodes forward
3) Return True (while loop condition is broken, cycle found)

**Time Complexity**: O(n)
**Space Complexity**: O(1)

Implement:

Review:

Evaluate:

 */

import java.util.LinkedList;
/*
public class DetectCycle {
    public static boolean detectCycle(LinkedList<Integer> head){
        LinkedList<Integer> slowNode = head;
        LinkedList<Integer> fastnode = head;

        while(slowPointer != null && fastPointer != null && fastPointer.next != null){
            slowNode = slowNode.next;
            fastNode = fastNode.next.next;
            if(slowNode == fastNode){
                return true;
            }
        }
        return false;
    }

}*/
