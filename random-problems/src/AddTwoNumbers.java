import org.w3c.dom.Node;

import java.util.Deque;

public class AddTwoNumbers {

    public class ListNode {
        int val;        // o valor guardado nesse nó (um dígito, nesse problema)
        ListNode next;  // referência para o próximo nó (ou null se for o último)
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    // 342 + 465
    // [2 -> 4 -> 3] e [ 5 -> 6 - >4]
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        if (l1 == null && l2 == null) {
            return null;
        }

        if(l1 == null) {
            l1 = new ListNode(0);
        } else if (l2 == null) {
            l2 = new ListNode(0);
        }

        if(l1.next != null){
            l1.next.val += (l1.val + l2.val) / 10;
        } else if (l2.next != null){
            l2.next.val += (l1.val + l2.val) / 10;
        } else if (l1.val + l2.val >= 10){
            l1.next = new ListNode((l1.val + l2.val) / 10);
        }

        return new ListNode((l1.val + l2.val) % 10, addTwoNumbers(l1.next, l2.next));
    }
}
