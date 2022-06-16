//package com.company;
/*
Problem #3: Merge Two Sorted Lists
Merge two sorted linked lists.

Examples:

Input: 1->2->4, 1->3->4
Output: 1->1->2->3->4->4

Understand:
Be sure that you clarify the input and output parameters of the problem:

Can we create new nodes?
No. The question asks you to splice the given nodes.
Will the input lists be sorted?
Yes. This is stated in the problem statement.
Can we expect empty input lists?
Yes. The lists may have 0-50 nodes
Can the node values be negative?
Yes. The node values will fall between -100 and 100.
Can the input lists have differing lengths?
Yes. Do not assume they will have the same length.
Run through a set of example cases:
HAPPY CASE
Input: 1->2->4, 1->3->4
Output: 1->1->2->3->4->4

Input: 4->7->10 -4->3->4->5
Output: -4->3->4->4->5->7->10

EDGE CASE
Input: [ ], [ ]
Output: [ ]

EDGE CASE
Input: [ ], 1->2
Output: 1->2

Match:
For Linked Lists, the top three things we want to consider are:

If we were able to take multiple passes of the linked list, would that help solve the problem?
We are not trying to determine the length of the list, nor are we trying to determine something about the values stored at each node in the list. We also only need to take one pass over each list to determine the values to be stored in the nodes of the return list.
Would using a dummy head as a starting point help simplify our code and handle edge cases?
A dummy head can help us rearrange our list. Can you think of a way to use the dummy head to rearrange and incorporate values into one list from the other?
If we used two pointers to iterate through list, would that help us solve this problem?
Two pointers could help us in this problem. At what speed should we move the pointers? Where should both pointers point to initially?
Additionally, for this problem, we can consider other data structures that may come in handy. Are there any data structures that have built in sort operations?

Which of the above would provide us with an optimal solution?

Plan:
Similar to the previous approach, but instead of building a new linked list we change the next pointers based on which value is smaller. We start with a dummy head. The dummy head's next will be whichever is the smaller head of the two linked lists. Iterate through this step until one of the list's head next is null. At which point we point it to the rest of the other list.

1) Instantiate a new node with a value of 0.
   This will be our dummy node, the node to the left of the head of our return list.
   Store a reference to this node so that we can return the list at the end.
2) Create a pointer, tail, that always points to the end of our LL. Initialize it to point to the dummy node.
3) Iterate over the LLs (while head1 or head2) where head1 and head2 are pointers to the heads of the input LLs
    a) If head1.val <= head2.val, append head1 to the list by pointing tail's next pointer to head1.
       Move head1 forward one node.
    b) Otherwise, append head2 to the list by pointing tail's next pointer to head2.
       Move head2 forward one node
4) Move tail forward one node
5) Figure out if either list still hasn't been fully traversed.
   If it hasn't, point tail's next to the head of the list that hasn't been fully traversed.
6) Return dummy.next

Implement:

Review:

Evaluate:

 */

import java.util.LinkedList;

public class MergeSortedLinkedList {

}
