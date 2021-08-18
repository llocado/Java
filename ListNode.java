public class ListNode {
    int val;
    ListNode next;
    ListNode() {};
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { 
        this.val = val; this.next = next;}
    
    void printList (ListNode node){
    while (node!= null){
        System.out.print("%d" + node.val);
        node=node.next;
    }
    }
}
