package com.bobabelga;


import java.util.ArrayList;

public class LinkedListCycleII {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(3);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(0);
        listNode.next.next.next = new ListNode(-4);
        listNode.next.next.next.next = listNode.next;

        ListNode listNode2 = new ListNode(1);
        detectCycle(listNode);
        detectCycle(listNode2);
    }

    public static ListNode detectCycle(ListNode head) {
        int pos = -1 ;
        ArrayList<ListNode> arrayListNodes = new ArrayList<>();
        arrayListNodes.add(head);
        while (pos==-1 && head != null) {
            for (int i = 0; i <arrayListNodes.size() ; i++) {
                if (head.next == arrayListNodes.get(i)) {
                    pos = i;
                    break;
                }
                System.out.print("  "+i);
            }
            arrayListNodes.add(head.next);
            head= head.next;
        }
        System.out.println(" Pos =  "+pos);
        System.out.println(head);
        return head;
    }
}
// Definition for singly-linked list.
class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }