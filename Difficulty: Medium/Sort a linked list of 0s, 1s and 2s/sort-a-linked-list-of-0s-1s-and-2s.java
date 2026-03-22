/*
class Node {
    int data;
    Node next;

    Node(int d)
    {
        data = d;
        next = null;
    }
}*/

class Solution {
    public Node segregate(Node head) {
      Node temp = head;
      int cnt0 = 0;
      int cnt1=0;
      int cnt2=0;
      while(temp!=null){
         if(temp.data==0) cnt0++;
         else if(temp.data==1) cnt1++;
         else if(temp.data==2) cnt2++;
         temp=temp.next;
      }
      Node st = head;
      for(int i=0;i<cnt0;i++){
          st.data=0;
          st=st.next;
      }
      for(int i=0;i<cnt1;i++){
          st.data=1;
          st=st.next;
      }
      for(int i=0;i<cnt2;i++){
          st.data=2;
          st=st.next;
      }
      return head;
    }
}