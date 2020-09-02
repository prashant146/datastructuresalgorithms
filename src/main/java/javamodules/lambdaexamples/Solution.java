package javamodules.lambdaexamples;

import java.util.function.BiFunction;
import java.util.function.Consumer;

public class Solution {

    public static void main(String[] args) {

    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode curr1 = l1;
        ListNode curr2 = l2;
        ListNode first = null;
        boolean carry = false;
        int sum = 0;
        while(curr1!=null || curr2!=null || carry){

            if(curr1!=null && curr2!=null){
                sum = carry? 1+curr1.val+curr2.val : curr1.val+curr2.val;
                curr1=curr1.next;
                curr2=curr2.next;
            }else if(curr1!=null&&curr2==null){
                sum = carry?1+curr1.val : curr1.val;
                curr1=curr1.next;
            }else if(curr1==null && curr2!=null){
                sum = carry? 1 + curr2.val : curr2.val;
                curr2=curr2.next;
            }else{
                sum = 1;
            }

            if(sum>9){
                sum = sum%10;
                carry=true;
            }else{
                carry=false;
            }
            ListNode listNode = new ListNode(sum);
            if(first == null){
                first = listNode;
            }else{
                ListNode current = first;
                while(current.next!=null){
                    current=current.next;
                }
                current.next=listNode;
            }

        }
        return first;

    }


    public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

}
