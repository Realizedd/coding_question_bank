package level2;

public class Level2Q4 {

    class Node {

        private char val;
        private Node prev;
        private Node next;

        Node(char val) {
            this.val = val;
        }
    }

    public int solution(String s) {
        if (s.isEmpty()) {
            return 1;
        }

        Node head = new Node((char) 0);
        Node cur = head;

        for (int i = 0; i < s.length(); i++) {
            Node newNode = new Node(s.charAt(i));
            cur.next = newNode;
            newNode.prev = cur;
        }

        cur = head.next;

        while (cur != null) {
            if (cur.next != null && cur.val == cur.next.val) {
                cur.prev.next = cur.next.next;
                System.out.println("Deleted " + cur.val + " and " + cur.next.val);
                cur = head.next;
            }

            cur = cur.next;
        }
        
        return head.next == null ? 1 : 0;
    }
}
