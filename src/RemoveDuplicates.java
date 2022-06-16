/*

Problem #1: Remove Duplicates from Sorted List
Given a sorted linked list, delete all duplicates such that each element appear only once.

Examples:

Input: 1->1->2
Output: 1->2

Input: 1->1->2->3->3
Output: 1->2->3

Understand:
Will the elements in the LinkedList be sorted? Yes
What values can we expect in the LinkedList? 0-300
Is it garaunteed that there will be dupicates or will LL also be unique? unique and dupes exists

HAPPY CASE
Input: 0->1->2
Output: 0->2

EDGE CASE
Input: 1->1->2->3
Output: 1->2->3

EDGE CASE
Input: 1->3->4->4
Output: 1->3->4
Match:
If we were able to take multiple passes of the linked list, would that help solve the problem?
Taking multiple passes of the list could tell us how many duplicates there are for each number.
This could help us develop a solution.
Would using a dummy head as a starting point help simplify our code and handle edge cases?
We are not rearranging the list. Rather, we are removing duplicate instances. A dummy head would help us if we were to
remove the first element of the list. However, if the first element is duplicated we could remove the duplicates besides
the first element, right?
If we used two pointers to iterate through the list at different speeds, would that help us solve this problem?
Two pointers could help us in this problem. How could we use two different pointers in this problem? Would we have the
pointers on two different ends of this list? Could the pointers reference the same node initially?


Plan:


Implement:

Review:

Evaluate:

 */

//package com.company;

import java.util.LinkedList;

public class RemoveDuplicates {
    /*
    public static ListNode removeDupes(ListNode head){
        ListNode currentNode = head;

        while(currentNode != null && currentNode.next != null){
            if(currentNode == currentNode.next){
                currentNode.next = currentNode.next.next;
            }
            else{
                currentNode = currentNode.next;
            }
        }
        return head;
    }*/

}

