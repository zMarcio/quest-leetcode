void main() {
    AddTwoNumbers s = new AddTwoNumbers();

    // 342 + 465 = 807
    AddTwoNumbers.ListNode l1 = s.new ListNode(2, s.new ListNode(4, s.new ListNode(3)));
    AddTwoNumbers.ListNode l2 = s.new ListNode(5, s.new ListNode(6, s.new ListNode(4)));
    IO.println("resultado: " + formatar(s.addTwoNumbers(l1, l2)) + " | esperado: [7, 0, 8]");

    // 5 + 5 = 10
    l1 = s.new ListNode(5);
    l2 = s.new ListNode(5);
    IO.println("resultado: " + formatar(s.addTwoNumbers(l1, l2)) + " | esperado: [0, 1]");

    // 999 + 1 = 1000
    l1 = s.new ListNode(9, s.new ListNode(9, s.new ListNode(9)));
    l2 = s.new ListNode(1);
    IO.println("resultado: " + formatar(s.addTwoNumbers(l1, l2)) + " | esperado: [0, 0, 0, 1]");
}

String formatar(AddTwoNumbers.ListNode no) {
    StringBuilder sb = new StringBuilder("[");
    while (no != null) {
        sb.append(no.val);
        if (no.next != null) sb.append(", ");
        no = no.next;
    }
    return sb.append("]").toString();
}
