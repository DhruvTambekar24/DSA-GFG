/*
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/

class Solution {
    public Node addOne(Node head) {;
       head = reverse(head);
        Node curr = head;
        int carry = 1;
        while (curr != null) {
            int sum = curr.data + carry;
            curr.data = sum % 10;
            carry = sum / 10;
            if (carry == 0) break;
            if (curr.next == null && carry > 0) {
                curr.next = new Node(carry);
                carry = 0;
                break;
            }
            curr = curr.next;
        }

        return reverse(head);
    }
    private Node reverse(Node head){
        Node prev = null;
        Node cur = head;
        while(cur!=null){
            Node neww = cur.next;
            cur.next=prev;
            prev=cur;
            cur=neww;
        }
        return prev;
    }
}